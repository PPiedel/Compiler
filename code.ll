; ModuleID = 'code.c'
target datalayout = "e-m:e-i64:64-f80:128-n8:16:32:64-S128"
target triple = "x86_64-pc-linux-gnu"

define i32 @main() #0 {
	%zmienna = alloca i32, align 4
	store i32 5, i32* %zmienna, align 4
	%drugazmienna = alloca float, align 4
	store float 10.000000, float* %drugazmienna, align 4
	ret i32 0
}

define i32 @superIntFunkcja() #0 {
	ret i32 0
}

define float @superFloatFunkcja() #0 {
	%zmienna = alloca i32, align 4
	store i32 5, i32* %zmienna, align 4
	%drugazmienna = alloca float, align 4
	store float 10.500000, float* %drugazmienna, align 4
	ret float 5.000000
}
attributes #0 = { nounwind uwtable "disable-tail-calls"="false" "less-precise-fpmad"="false" "no-frame-pointer-elim"="true" "no-frame-pointer-elim-non-leaf" "no-infs-fp-math"="false" "no-nans-fp-math"="false" "stack-protector-buffer-size"="8" "target-cpu"="x86-64" "target-features"="+fxsr,+mmx,+sse,+sse2" "unsafe-fp-math"="false" "use-soft-float"="false" }

!llvm.ident = !{!0}

!0 = !{!"clang version 3.8.0-2ubuntu4 (tags/RELEASE_380/final)"}