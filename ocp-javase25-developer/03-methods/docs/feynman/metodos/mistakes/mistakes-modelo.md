MISTAKE-001
----------

Tema:
Autoboxing

Código:
Integer x = null;
int y = x;

Resultado:
NullPointerException

Por que errei:
Confundi wrapper com primitive.

Regra:
Unboxing de null gera NPE.

Revisões:
D+1  ✓
D+3  ✓
D+7  ✗
D+14 —
