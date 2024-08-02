module FuncoesDiversas where

calculaReajuste :: Float -> Float
calculaReajuste salario = salario*1.2

calculaMedia :: Float -> Float -> Float -> Float -> Float -> Float -> Float
calculaMedia nota1 peso1 nota2 peso2 nota3  peso3 = (nota1*peso1 + nota2*peso2 + nota3*peso3)/(peso1 + peso2 + peso3)

converteCelsiusParaFahrenheit :: Float -> Float
converteCelsiusParaFahrenheit celsius = celsius*9/ 5 + 32

idadeEm2032 :: Int -> Int
idadeEm2032 ano = 2032 - ano

horasParaMinutos :: Int -> Int -> Int
horasParaMinutos horas minutos = horas*60 + minutos 

calculaSomaQuadrados :: Float -> Float -> Float -> Float
calculaSomaQuadrados v1 v2 v3 = v1**2 + v2**2 + v3**2

ehImpar :: Int -> Bool
ehImpar x = (x `mod` 2 == 1)

ehDivisivel :: Int -> Int -> Bool
ehDivisivel x y = x `mod` y == 0

calculaSalarioAReceber :: Float -> Float
calculaSalarioAReceber salarioBase = salarioBase * 0.98