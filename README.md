# DependencySorter

Dep A has no Dep
Dep B has no Dep
Dep C has Dep on A

Dep D has Dep on A, B, E
Dep E has Dep on B, F
Dep F has Dep On B, C
Dep G has Dep On A, D


OutPut:
A -> B -> C -> F-> E-> D-> G

Sort alogirthm example
