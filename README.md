jit-example
===========

Example project that demonstrates how to control JIT compilation in the HotSpot JVM.

Usage:
```shell
mvn compile
mvn exec:exec -DmainClass=ex1.Main       # Tiered compilation (default)
mvn exec:exec@int -DmainClass=ex1.Main   # Turning off JIT compilation
mvn exec:exec@graal -DmainClass=ex1.Main # Turning on the experimental GraalVM JIT compiler
```

To experiment with the different settings replace `ex1.Main` with `ex2.Main` or `ex3.Main`.
