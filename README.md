# Padrões de Projeto em Java — Bruno

Atividade da disciplina Aplicações para Internet. Cada pasta traz um padrão de projeto com suas classes e interfaces (uma por arquivo) e um `Main.java` que mostra o padrão funcionando no console.

| Pasta | Padrão | Cenário |
|---|---|---|
| `Singleton` | Singleton | `ConfiguracaoGlobal` com url, porta e timeout do banco |
| `Strategy` | Strategy | `CarrinhoDeCompras` pagando com cartão, PayPal ou PIX |
| `FactoryMethod` | Factory Method | `RelatorioFactory` criando relatórios PDF, Excel e HTML |
| `Observer` | Observer | `Acao` avisando `AppCelular` e `PainelWeb` quando o preço muda |
| `Facade` | Facade | `HomeTheaterFacade` controlando TV, amplificador, Blu-ray e luzes |
| `Decorator` | Decorator | `HamburguerBase` com adicionais `Bacon`, `Queijo` e `Ovo` |
| `Adapter` | Adapter | `FreteAdapter` ligando `CalculadorFrete` ao legado `FreteAntigoXML` |

## Requisitos

JDK 11 ou mais recente (testado com o JDK 21). As classes não usam pacotes.

## Como rodar

Entre na pasta do padrão, compile e execute:

```bash
cd Singleton
javac -encoding UTF-8 *.java
java Main
```

Os comandos são os mesmos para todas as pastas:

```bash
cd Singleton     && javac -encoding UTF-8 *.java && java Main && cd ..
cd Strategy      && javac -encoding UTF-8 *.java && java Main && cd ..
cd FactoryMethod && javac -encoding UTF-8 *.java && java Main && cd ..
cd Observer      && javac -encoding UTF-8 *.java && java Main && cd ..
cd Facade        && javac -encoding UTF-8 *.java && java Main && cd ..
cd Decorator     && javac -encoding UTF-8 *.java && java Main && cd ..
cd Adapter       && javac -encoding UTF-8 *.java && java Main && cd ..
```

No PowerShell do Windows 5.1, troque `&&` por `;`. Se os acentos aparecerem errados no terminal, rode `chcp 65001` antes.
