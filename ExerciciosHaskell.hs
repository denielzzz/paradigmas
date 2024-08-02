module Main where

-- 1 to 10 --------------------------------------------------------

achaUltimoElemento :: [a] -> a
achaUltimoElemento [] = error "Lista vazia"
achaUltimoElemento [a] = a
achaUltimoElemento (_:t) = achaUltimoElemento t
-- achaUltimoElemento lista = last lista

achaPenultimoElemento :: [a] -> a
achaPenultimoElemento [a, _] = a
achaPenultimoElemento (_:t) = achaPenultimoElemento t
-- achaPenultimoElemento lista = lista !! (length lista - 2)

elementAt :: [a] -> Int -> a
elementAt lista indice = lista !! (indice - 1)

elementNumber :: [a] -> Int
elementNumber [] = 0
elementNumber (h:t) = 1 + elementNumber t 

reverseList :: [a] -> [a]
reverseList [] = []
reverseList (h:t) = reverseList t ++ [h]

isPalindrome :: Eq a => [a] -> Bool
isPalindrome lista = lista == reverseList lista

compress :: Eq a => [a] -> [a]
compress [] = []
compress [a] = [a]
compress (h:t)
    | h == head t = compress t
    | otherwise = h:compress t

pack :: Eq a => [a] -> [[a]]
pack [] = []
pack [a] = [[a]]
pack (h:t) = if h == head (head (pack t)) then (h:head (pack t)) : tail (pack t) else [h] : pack t

encode :: Eq a => [a] -> [(Int, a)]
encode [] = []
encode (h:t) = if h == head t then (1 + length (takeWhile (== h) t), h) : encode (dropWhile (== h) t) else (1, h) : encode t

-- 11 to 20 --------------------------------------------------------

duplicate :: [a] -> [a]
duplicate [] = []
duplicate (h:t) = h:h:duplicate t

replicate2 :: a -> Int -> [a]
replicate2 _ 0 = []
replicate2 h n = h:replicate2 h (n-1)

repli :: [a] -> Int -> [a]
repli [] _ = []
repli (h:t) n = replicate2 h n ++ repli t n    

dropEvery :: [a] -> Int -> [a]
dropEvery [] _ = []
dropEvery (h:t) n = take (n-1) (h:t) ++ dropEvery (drop (n-1) t) n

split3 :: [a] -> Int -> [a]
split3 [] _ = []
split3 (h:t) n
    | n /= 0 = split3 t (n-1)
    | otherwise = h:split3 t n

split2 :: [a] -> Int -> [a]
split2 [] _ = []
split2 _ 0 = []
split2 (h:t) n = h:split2 t (n-1)

split :: [a] -> Int -> ([a], [a])
split (h:t) n = (prim, sec)
    where
        prim = split2 (h:t) n 
        sec = split3 (h:t) n  

slice :: [a] -> Int -> Int -> [a]
slice l n1 n2 = split2 (split3 l (n1-1)) (n2-n1+1)

rotate :: [a] -> Int -> [a]
rotate l n = if n >= 0 then split3 l n ++ split2 l n else split3 l ((length l)+n) ++ split2 l ((length l)+n)

main :: IO ()
main = do    
    let lista = ['a','b','c','d','e','f','g','h']
    -- print (achaUltimoElemento lista)
    -- print (achaPenultimoElemento lista)
    -- print (elementAt lista 1)
    -- print (elementNumber lista)
    -- print (reverseList lista)
    -- print (isPalindrome lista)
    -- print (compress lista)
    -- print (pack lista)
    -- print (encode lista)
    -- print (duplicate lista)
    -- print (repli lista 100)
    -- print (dropEvery lista 3)
    -- print (split lista 3)
    -- print (slice lista 2 7)
    print (rotate lista (-2))
