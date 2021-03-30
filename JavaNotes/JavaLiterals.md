# Java Literals
- a source code representation of a fixed value
- represented directly in the code without any computation
- can be assigned to any primitive type variable
```
byte a = 68;
char a = 'A'
```
byte, int, long, and short can be expressed in decimal(base 10), hexadecimal(base 16) or octal(base 8) number systems as well.

Prefix 0 is used to indicate octal and prefix 0x indicates hexadecimal when using these number systems for literals. For example:
```
int decimal = 100;
int octal = 0144;
int hexa =  0x64;
```

## String literals
- specified like they are in most other languages by enclosing a sequence of characters between a pair of double quotes
```
"Hello World"
"two\nlines"
"\"This is in quotes\""
```

String and char types of literals can contain any Unicode characters
```
char a = '\u0001';
String a = "\u0001";
```
[Java language supports few special escape sequences for String and char literals as well](../img/literals.png)