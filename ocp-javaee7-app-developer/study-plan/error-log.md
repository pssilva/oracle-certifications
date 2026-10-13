# Error Log — 1Z0-900

Cada erro (questão, deploy, experimento) vira um registro. Revisão espaçada: D+1, D+3, D+7, D+14.
O detalhe fica em `<NN-módulo>/docs/feynman/<conceito>/mistakes/`; aqui fica o índice.

| ID | Data | Tópico | Conceito | Regra (1 linha) | D+1 | D+3 | D+7 | D+14 |
| --- | --- | --- | --- | --- | --- | --- | --- | --- |
| MISTAKE-001 | | | | | | | | |

## Modelo

```
MISTAKE-NNN
----------

Tema:
Transações CMT

Código:
@TransactionAttribute(TransactionAttributeType.MANDATORY)
public void log(String msg) { ... }   // chamado sem transação ativa

Resultado:
javax.ejb.EJBTransactionRequiredException

Por que errei:
Confundi MANDATORY com SUPPORTS.

Regra:
MANDATORY exige transação do chamador; SUPPORTS usa se houver.

Revisões:
D+1  ✓
D+3  ✓
D+7  ✗
D+14 —
```
