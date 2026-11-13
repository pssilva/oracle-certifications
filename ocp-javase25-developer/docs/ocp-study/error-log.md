# Error Log — OCP Java SE 25 (1Z0-831)

> Registro de erros dos simulados, organizado por tópico do exame.
> Para cada erro: **o que marquei → gabarito → armadilha → regra para fixar → onde revisar**.
> Uma questão errada só sai do log depois de ser acertada **duas vezes seguidas** em revisões espaçadas (D+1, D+3, D+7).

---

## Simulado 01 — 02/11/2026

**Resultado:** 16 / 50 (**32%**) · meta de aprovação 68% (34) · faltaram **18 acertos** · tempo 116 / 120 min

| Prioridade | Tópico | Acertos | % | Questões erradas |
|:--:|---|--:|--:|---|
| 🔴 1 | T1 Data, hora, texto, números e booleanos | 0 / 6 | 0% | 09, 17, 23, 43, 48, 49 |
| 🔴 2 | T9 E/S (java.io e java.nio.file) | 0 / 3 | 0% | 03, 38, 42 |
| 🔴 3 | T3 Princípios de orientação a objetos | 2 / 11 | 18% | 04, 05, 15, 20, 25, 36, 40, 45, 50 |
| 🔴 4 | T2 Controle de fluxo | 1 / 4 | 25% | 10, 41, 44 |
| 🟠 5 | T6 Streams e expressões lambda | 2 / 7 | 29% | 07, 14, 28, 30, 35 |
| 🟠 6 | T5 Arrays e coleções | 2 / 5 | 40% | 16, 37, 39 |
| 🟡 7 | T7 Empacotamento e implantação | 2 / 4 | 50% | 11, 18 |
| 🟡 8 | T10 Localização | 1 / 2 | 50% | 27 |
| 🟢 9 | T4 Tratamento de exceções | 3 / 4 | 75% | 32 |
| 🟢 10 | T8 Concorrência | 3 / 4 | 75% | 33 |

> **Correções na folha de respostas** (`docs/questions-exam/simulado-01.md`):
> - **Q03** estava marcada ✔, mas a resposta foi `E` e o gabarito é `C` → é um **erro**. T9 fica em **0/3**. O total 16/50 já estava certo; só a tabela por tópico estava errada (T9 1/3).
> - **Q18**: o enunciado colocou o conteúdo do `module-info.java` como alternativa A, então as letras andaram uma posição. O gabarito `B, C` se contradiz (B diz "todos exportados" e C diz "nenhum exportado"). O correto é **`C, D`**: nenhum pacote é exportado e o `main` pode ser executado.

### Diagnóstico transversal (vale mais que qualquer tópico)

| Padrão | Questões | Ação |
|---|---|---|
| **Múltipla escolha parcial**: acertou parte, mas marcou uma a mais ou deixou uma de fora (vale zero) | 04, 05, 07, 15, 20, 23, 25, 28, 30, 33, 35, 37, 39, 42, 44, 45, 48, 49 (**18 de 34 erros**) | Julgue cada alternativa isoladamente como V/F antes de marcar e escreva o motivo em 3 palavras. Volte só nas que ficaram como "talvez". |
| **"Não compila" falso**: marcou erro de compilação em código válido | 09, 14, 17, 36, 38, 41 | Antes de marcar "não compila", aponte a **linha e a regra da JLS**. Sem regra concreta, assuma que compila. |
| **Erro de compilação não visto**: o código não compila e você escolheu uma saída | 10, 11, 30, 35, 40, 43, 50 | Varra o código **antes** de executar mentalmente: tipos em atribuições, contexto `static`, casts entre classes sem relação, diretivas duplicadas e `default` fora de `switch`. |
| **Tempo**: 116 de 120 min | — | Na 1ª passada gaste no máximo 1,5 min por questão e marque as dúvidas. Revise as marcadas no fim. |

---

## T1 — Data, hora, texto, números e booleanos (0/6) 🔴

| Q | Fonte | Marquei | Gabarito | Armadilha | Regra para fixar |
|--:|---|---|---|---|---|
| 09 | `14-operators/QCAP02_08` | E | **A** | Achou que `goat -= 1.0` exige cast | **Atribuição composta faz cast implícito**: `goat -= 1.0` ≡ `goat = (long)(goat - 1.0)` → 1. E `pig = pig++` atribui o valor **antigo** (4), porque o incremento se perde. |
| 17 | `14-operators/QCAP02_04` | E | **B** | Achou inválida a atribuição dentro da expressão | `(wolf=false)` é expressão e vale `false`. `^` **não** faz curto-circuito, então avalia os dois lados: `true ^ false = true`, e `wolf` passa a `false`. |
| 23 | `01-building-blocks/QCAP01_19` | D, F | **A, D** | Achou que `"B"` gera `NumberFormatException` | `Integer.valueOf("B", 16)` = 11 (base 16). `parseInt` → `int` primitivo; `valueOf` → `Integer`. `Integer.max(11, 11)` imprime 11. |
| 43 | `15-core-apis/QCAP04_01` | C | **F** | Não viu o tipo errado na linha 5 | `String s = numFish + 1;` → `int` não converte para `String`. A concatenação só acontece se **um operando já for String**. |
| 48 | `15-core-apis/QCAP04_16` | B, D | **A, G** | Fim exclusivo de `substring` | `substring(início, fim)`: fim **exclusivo**. `(1,2)` → `"b"`; `(2,2)` e `(6,6)` → `""` (sem exceção); `(6,5)` com início > fim → `StringIndexOutOfBoundsException`. |
| 49 | `01-building-blocks/QCAP01_07` | A, B | **C, E** | Achou que o text block interpola variáveis | Text block é **literal**: `"` e `+ numForks +` são texto. A indentação comum (10 espaços) é removida, e a linha com 11 espaços **começa com 1 espaço**. `numKnives` não inicializada não conta, porque é só texto. |

**Revisar:**
- [Operações](../../14-operators/docs/feynman/operacoes/README.md) · [Atribuição, comparação e ternário](../../14-operators/docs/feynman/atribuicao-comparacao-ternario/README.md) · [Precedência](../../14-operators/docs/feynman/precedencia-operadores/README.md)
- [Operações e casting](../../01-building-blocks/docs/feynman/operacoes-casting/README.md) · [Primitivos e wrappers](../../01-building-blocks/docs/feynman/primitivos-wrappers/README.md)
- [Strings](../../15-core-apis/docs/feynman/strings/README.md) · [StringBuilder e text blocks](../../15-core-apis/docs/feynman/stringbuilder-text-blocks/README.md)

**Para consolidar:** escreva no código e rode no `jshell` 5 casos de `x = x++`, `+=` com tipos mistos, `^`/`|`/`&` e `||`/`&&` (efeito colateral), e 4 text blocks com indentação diferente (use `.replace(" ", "·")` para ver os espaços).

---

## T9 — E/S (java.io e java.nio.file) (0/3) 🔴

| Q | Fonte | Marquei | Gabarito | Armadilha | Regra para fixar |
|--:|---|---|---|---|---|
| 03 | `09-io-api/QCAP14_01` | E | **C** | Confundiu leitura com escrita | **Ler** objeto = `ObjectInputStream.readObject()`; **gravar** = `ObjectOutputStream.writeObject()`. `ObjectReader`/`ObjectWriter`/`BufferedStream` não existem. |
| 38 | `09-io-api/QCAP14_06` | F | **C** | Achou que o código não compila | Na desserialização, o construtor sem argumentos da **primeira superclasse não-`Serializable`** (`Bird`) **é executado** → `name = "Matt"`. Os inicializadores e o construtor da classe serializável (`Eagle`) **não** rodam. Além disso, `name` é `transient`, então não é gravado. |
| 42 | `09-io-api/QCAP14_16` | A, F | **A, D** | Achou que `FileReader`/`FileWriter` são byte streams | `Reader`/`Writer` são streams de **caracteres**. `o` (efetivamente final) é fechado ao fim do try-with-resources, então `o.write("")` depois dele → `IOException` em runtime. O arquivo fica com 1 linha. |

**Revisar:**
- [Serialização](../../09-io-api/docs/feynman/serialization/README.md): regra "quem roda na desserialização"
- [I/O streams: leitura e escrita](../../09-io-api/docs/feynman/io-streams-leitura-escrita/README.md): tabela byte (`*Stream`) × caractere (`*Reader`/`*Writer`)
- [NIO.2](../../09-io-api/docs/feynman/io-api-nio2/README.md) · [Path, Files e atributos](../../09-io-api/docs/feynman/path-files-atributos/README.md)

**Para consolidar:** monte de memória a tabela das classes `java.io` (abstrata → baixo nível → alto nível; byte × caractere; entrada × saída). Depois escreva um teste que serializa uma subclasse `Serializable` de uma classe não serializável e confira qual construtor imprime.

---

## T3 — Princípios de orientação a objetos (2/11) 🔴

| Q | Fonte | Marquei | Gabarito | Armadilha | Regra para fixar |
|--:|---|---|---|---|---|
| 04 | `03-methods/QCAP05_07` | D, E | **D, F** | Achou que `{true, true}` vale como argumento | O atalho `{...}` só existe na **declaração** de array. Na chamada é obrigatório `new boolean[]{...}` ou `new boolean[2]`. |
| 05 | `01-beyond-classes/QCAP07_14` | A–E | **A, C, E** | Esqueceu o `non-sealed` e não reparou na grafia | B é falsa porque uma subclasse `non-sealed` pode ser estendida por qualquer classe, inclusive as que não estão no `permits`. D é falsa porque o modificador é `non-sealed` (com hífen) e `nonsealed` não existe. |
| 15 | `01-building-blocks/QCAP01_08` | A, B, D, H | **B, D, E, H** | Trocou `null` por `1/0` | `var x = null;` não compila (não há tipo para inferir). `var day = 1/0;` **compila**: o tipo é `int` e a `ArithmeticException` só ocorre em runtime. |
| 20 | `03-methods/QCAP05_01` | A, B | **A, E** | Definição de "efetivamente final" | **Efetivamente final** = nunca reatribuída, **sem** precisar de `final`. `final` em objeto bloqueia a **referência**, não o estado. `final var x = 1;` é legal. |
| 25 | `01-building-blocks/QCAP01_05` | A, C, F | **A, D, F** | Ignorou a referência no campo | O objeto da linha 10 continua alcançável via `brownBear.pandaBear` e só fica elegível quando `brownBear = null` (linha 13). `System.gc()` é só uma **sugestão**. |
| 36 | `01-building-blocks/QCAP01_21` | F | **D** | Achou que o inicializador de instância não compila | Ordem: inicializadores de instância **na ordem do código** → corpo do construtor. Saída `7-` `0-` (count++ = 1) `2-` (count = 4) `4-`. |
| 40 | `01-beyond-classes/QCAP07_29` | C | **F** | Achou que o cast entre classes compila | `this().age` é inválido (linhas 5 e 12: `this()` só como **instrução**, na 1ª linha). `(Primate) new Orangutan()` entre **classes** sem herança **não compila** (linha 15). Com **interfaces**, o cast compila. |
| 45 | `01-building-blocks/QCAP01_18` | C, F, G | **B, C, F** | Achou que `var` é palavra reservada | `var` é **nome de tipo reservado**, não palavra-chave: `int var = 1;` compila. O tipo é definido em **compilação**. Só vale para variáveis locais (não campos, não parâmetros, não declaração múltipla). |
| 50 | `01-beyond-classes/QCAP07_18` | G | **E** | Não viu o contexto `static` | `Diet` é classe **interna** (não `static`): `new Diet()` dentro de `main` (static) precisa de `new Deer().new Diet()`. O `private` em `getFavorite()` não atrapalha, porque o acesso é na mesma classe de topo. |

**Revisar:**
- [Sobrecarga e varargs](../../03-methods/docs/feynman/sobrecarga-varargs/README.md) · [Passagem de parâmetros](../../03-methods/docs/feynman/passagem-parametros/README.md) · [Modificadores de acesso](../../03-methods/docs/feynman/modificadores-acesso/README.md)
- [Classes sealed](../../01-beyond-classes/docs/feynman/classes-sealed/README.md) · [Classes aninhadas](../../01-beyond-classes/docs/feynman/classes-aninhadas/README.md) · [Polimorfismo](../../01-beyond-classes/docs/feynman/polimorfismo/README.md)
- [Inferência var](../../01-building-blocks/docs/feynman/inferencia-var-variaveis-sem-nome/README.md) · [Ciclo de vida e GC](../../01-building-blocks/docs/feynman/ciclo-vida-objetos-garbage-collection/README.md)
- [Inicializadores de instância e static](../../01-class-design/docs/feynman/inicializadores-de-instancia-e-static/README.md) · [Construtores](../../01-class-design/docs/feynman/construtores/README.md)

**Para consolidar:** (1) desenhe o diagrama de referências (pilha → heap) das questões de GC; (2) faça uma tabela de "pode instanciar onde?" para classe interna, `static` aninhada, local e anônima; (3) memorize a ordem de inicialização: static da superclasse → static da subclasse → instância da superclasse + construtor → instância da subclasse + construtor.

---

## T2 — Controle de fluxo (1/4) 🔴

| Q | Fonte | Marquei | Gabarito | Armadilha | Regra para fixar |
|--:|---|---|---|---|---|
| 10 | `02-making-decisions/QCAP03_08` | C | **G** | Não viu dois erros | Linha 36: em `o instanceof Long bat \|\| bat <= 20`, `bat` **não está em escopo** do lado direito do `\|\|` (só funciona com `&&`). Linha 38: `default` não existe em `if`. A linha 34 compila, porque o `bat` da linha 32 não está em escopo no `else`. |
| 41 | `02-making-decisions/QCAP03_29` | E | **C** | Achou que `do` sem chaves não compila | `do instrução; while (cond);` é legal com uma instrução. O `do-while` testa **depois**: com y = 5 imprime `6` e então para. |
| 44 | `02-making-decisions/QCAP03_02` | C | **A, B, C** | Só marcou o wrapper | O `switch` aceita `int` e menores (`byte`, `short`, `char`) e seus **wrappers**, `String`, `enum` e (com pattern matching) qualquer tipo de referência. **Não** aceita `long`, `boolean`, `float` ou `double` (primitive patterns, JEP 507, ainda são *preview* no Java 25). |

**Revisar:**
- [if/else e pattern matching](../../02-making-decisions/docs/feynman/if-else-pattern-matching/README.md): **flow scoping** com `&&`, `||`, `!` e `else`
- [switch statements e expressions](../../02-making-decisions/docs/feynman/switch-statements-expressions/README.md) · [Laços](../../02-making-decisions/docs/feynman/lacos-while-for-foreach/README.md)

**Para consolidar:** escreva 6 condições com `instanceof` + pattern (`&&`, `||`, `!x instanceof`, `if`/`else`, retorno antecipado) e anote se a variável está em escopo em cada ponto. Confirme com `javac`.

---

## T6 — Streams e expressões lambda (2/7) 🟠

| Q | Fonte | Marquei | Gabarito | Armadilha | Regra para fixar |
|--:|---|---|---|---|---|
| 07 | `07-streams/QCAP10_20` | C, D, E | **C, E, F** | Aceitou `throw` em lambda de expressão e esqueceu o `get()` | `() -> throw new X()` **não compila**: `throw` é instrução e exige `{ throw ...; }`. `get()` com Optional vazio → `NoSuchElementException`. |
| 14 | `07-streams/QCAP10_01` | E | **D** | Achou que não compila | `println(stream)` chama `toString()` do pipeline → `ReferencePipeline$3@hash`. Sem operação **terminal** nada é avaliado, então o `iterate` infinito não trava. |
| 28 | `06-lambdas-functional-interfaces/QCAP08_06` | A, C, E | **A, C** | Tipo do parâmetro | O tipo explícito no lambda precisa **bater** com o genérico: `Predicate<String>` não aceita `(StringBuilder s) -> ...`. `-->` não é operador. |
| 30 | `07-streams/QCAP10_14` | C, E | **B, D** | Métodos de stream primitivo × objeto | `boxed()` só existe em streams **primitivos** (linha 5). `mapToInt` devolve `IntStream`, não `Stream<Integer>` (linha 7). `mapToDouble(x -> x)` com `Integer` compila (unboxing + widening). |
| 35 | `07-streams/QCAP10_05` | D | **C, F** | `collect(Collector)` em stream primitivo | `IntStream.collect` só aceita 3 argumentos (supplier, accumulator, combiner), então é preciso `boxed()` antes de usar `Collectors`. `LongStream.mapToInt(x -> x)` não compila sem `(int)` (conversão com perda de `long` para `int`). |

**Revisar:**
- [Streams primitivos](../../07-streams/docs/feynman/streams-primitivos/README.md): tabela `mapToObj`/`mapToInt`/`boxed`/`asDoubleStream`
- [Optional](../../07-streams/docs/feynman/optional/README.md) · [Streams](../../07-streams/docs/feynman/streams/README.md) · [Collectors](../../07-streams/docs/feynman/collectors-agrupamento-e-particionamento/README.md)
- [Lambda](../../06-lambdas-functional-interfaces/docs/feynman/lambda/README.md) · [Interfaces funcionais built-in](../../06-lambdas-functional-interfaces/docs/feynman/interfaces-funcionais-built-in/README.md)

**Para consolidar:** monte a matriz de conversões entre `Stream<T>`, `IntStream`, `LongStream` e `DoubleStream` (qual método leva de onde para onde e qual interface funcional ele recebe). Liste também os métodos do Optional que lançam exceção (`get`, `orElseThrow()`, `orElseThrow(Supplier)`).

---

## T5 — Arrays e coleções (2/5) 🟠

| Q | Fonte | Marquei | Gabarito | Armadilha | Regra para fixar |
|--:|---|---|---|---|---|
| 16 | `05-collections-generics/QCAP09_14` | E | **A** | Achou que `binarySearch` lança exceção | Os dois `reverse` se anulam. `binarySearch` (sem comparator) presume ordem **natural**: com `c2` → `[2,4,5,7]` → índice 0. Com ordem decrescente o resultado é **indefinido**, mas não lança exceção. |
| 37 | `15-core-apis/QCAP04_02` | C, D, E | **C, E, F** | Declaração mista `[]` | `Date[] dates[]` = array 2D, **legal**. Ilegais: `new beans[6]` (beans não é tipo), `new int[]` sem tamanho e `new int[][]` sem a **primeira** dimensão. |
| 39 | `05-collections-generics/QCAP09_11` | A, B, C, F | **A, B, E, F** | `Map.forEach` | `Map.forEach` recebe `BiConsumer<K,V>`, e `System.out::println` não tem versão de 2 parâmetros, então não compila. `keySet()` e `values()` são `Collection` e funcionam. `keys()`/`valueSet()` não existem. |

**Revisar:**
- [Ordenação: Comparable e Comparator](../../05-collections-generics/docs/feynman/ordenacao-comparable-e-comparator/README.md) · [Map](../../05-collections-generics/docs/feynman/map/README.md) · [List](../../05-collections-generics/docs/feynman/list/README.md)
- [Array](../../15-core-apis/docs/feynman/array/README.md): declarações, `Arrays.binarySearch`/`sort`/`compare`/`mismatch`

---

## T7 — Empacotamento e implantação (2/4) 🟡

| Q | Fonte | Marquei | Gabarito | Armadilha | Regra para fixar |
|--:|---|---|---|---|---|   
| 11 | `11-modules/QCAP12_23` | A | **E** | Não viu a duplicata | `requires skin;` + `requires transitive skin;` = o mesmo módulo duas vezes → erro na **linha 5**. `exports ... to bird` é legal mesmo que `bird` não exista (só gera *warning*). |
| 18 | `11-modules/QCAP12_10` | A, C, E | **C, D**¹ | Exportação × execução | `module x {}` **não exporta nada**, mas o `main` **pode** rodar (`java -p mods -m x/pkg.Main`). `exports` controla o acesso de **outros** módulos, não a execução. |

¹ O gabarito da folha (`B, C`) está desalinhado. Veja as correções no topo.

**Revisar:**
- [Diretivas module-info e reflexão](../../11-modules/docs/feynman/diretivas-module-info-reflexao/README.md) · [Módulos](../../11-modules/docs/feynman/modulos/README.md) · [Tipos de módulos e migração](../../11-modules/docs/feynman/tipos-modulos-migracao/README.md)

---

## T10 — Localização (1/2) 🟡

| Q | Fonte | Marquei | Gabarito | Armadilha | Regra para fixar |
|--:|---|---|---|---|---|
| 27 | `04-exceptions-localization/QCAP11_22` | F | **B** | `m` × `M` e campo inexistente | `m` = **minuto** (30), `M` = mês. `z` (nome do fuso) com `LocalDateTime` → `DateTimeException` (não há fuso). A exceção é capturada, então o `y` nunca roda. Saída: `30`. |

**Revisar:**
- [Formatação de mensagens, datas e horas](../../04-exceptions-localization/docs/feynman/formatacao-mensagens-datas-horas/README.md) · [Datas e horas](../../15-core-apis/docs/feynman/datas-horas/README.md) · [Fusos horários](../../15-core-apis/docs/feynman/fusos-horarios-horario-verao/README.md)

**Para consolidar:** decore a tabela de letras: `y M d` / `h H m s S` / `a` / `z Z VV`. Para cada tipo (`LocalDate`, `LocalTime`, `LocalDateTime`, `ZonedDateTime`), anote quais letras lançam exceção.

---

## T4 — Tratamento de exceções (3/4) 🟢

| Q | Fonte | Marquei | Gabarito | Armadilha | Regra para fixar |
|--:|---|---|---|---|---|
| 32 | `04-exceptions-localization/QCAP11_18` | B | **C** | Esqueceu o `catch` | Os recursos fecham em ordem **inversa** (`W` e depois `D`). A exceção de `close()` é **capturada** pelo `catch` (`E`) e o `finally` vem por último. Saída: `TWDEF`. |

**Revisar:** [Recursos try-catch](../../04-exceptions-localization/docs/feynman/recursos-try-catch/README.md) · [Multi-catch e finally](../../04-exceptions-localization/docs/feynman/multi-catch-finally/README.md)

---

## T8 — Concorrência (3/4) 🟢

| Q | Fonte | Marquei | Gabarito | Armadilha | Regra para fixar |
|--:|---|---|---|---|---|
| 33 | `13-concurrency/QCAP13_18` | A, C, D | **C, E, G** | Sintaxe de lambda | `Callable<V>.call()` **não recebe parâmetros** e **retorna** valor (A e F recebem parâmetro; B não retorna). D não compila porque falta `;` em `return null`. |

**Revisar:** [ExecutorService, Runnable e Callable](../../13-concurrency/docs/feynman/executor-service-runnable-callable/README.md)

---

## Plano de revisão espaçada

| Data | Bloco | Conteúdo |
|---|---|---|
| 03/11/2026 (D+1) | 🔴 T1 + T9 | Conceitos Feynman listados + `jshell` (operadores, substring, text blocks) + tabela `java.io` |
| 04/11/2026 (D+2) | 🔴 T3 + T2 | Inicialização, classes aninhadas, `var`, GC, sealed; flow scoping |
| 05/11/2026 (D+3) | 🔁 refazer erradas | Refaça as 34 questões erradas **sem olhar o log**. As acertadas ganham ✔ na coluna R1. |
| 06/11/2026 | 🟠 T6 + T5 | Matriz de streams primitivos; Optional; `Map.forEach`; `binarySearch` |
| 07/11/2026 | 🟡 T7 + T10 + T4 + T8 | `module-info`; letras de `DateTimeFormatter`; ordem de fechamento; Callable |
| 09/11/2026 (D+7) | 🔁 refazer erradas | 2ª rodada (coluna R2). Ficam no log só as que errou de novo. |
| 10/11/2026 | 📝 Simulado 02 | Cronometrado; aplique as regras do diagnóstico transversal. Meta: ≥ 25/50 (50%). |

### Controle de revisão

| Q | Tópico | R1 (05/11) | R2 (09/11) |
|--:|---|:--:|:--:|
| 03 | T9 | | |
| 04 | T3 | | |
| 05 | T3 | | |
| 07 | T6 | | |
| 09 | T1 | | |
| 10 | T2 | | |
| 11 | T7 | | |
| 14 | T6 | | |
| 15 | T3 | | |
| 16 | T5 | | |
| 17 | T1 | | |
| 18 | T7 | | |
| 20 | T3 | | |
| 23 | T1 | | |
| 25 | T3 | | |
| 27 | T10 | | |
| 28 | T6 | | |
| 30 | T6 | | |
| 32 | T4 | | |
| 33 | T8 | | |
| 35 | T6 | | |
| 36 | T3 | | |
| 37 | T5 | | |
| 38 | T9 | | |
| 39 | T5 | | |
| 40 | T3 | | |
| 41 | T2 | | |
| 42 | T9 | | |
| 43 | T1 | | |
| 44 | T2 | | |
| 45 | T3 | | |
| 48 | T1 | | |
| 49 | T1 | | |
| 50 | T3 | | |
