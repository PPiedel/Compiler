; ModuleID = 'temp.c'
target datalayout = "e-m:e-i64:64-f80:128-n8:16:32:64-S128"
target triple = "x86_64-pc-linux-gnu"

; Function Attrs: nounwind uwtable
define i32 @main() #0 {
  %zmienna = alloca float, align 4
  %innaZmienna = alloca float, align 4
  %trzeciaZmienna = alloca float, align 4
  store float 1.000000e+00, float* %zmienna, align 4
  store float 2.000000e+00, float* %innaZmienna, align 4
  store float 3.000000e+00, float* %trzeciaZmienna, align 4
  %1 = load float, float* %innaZmienna, align 4
  %2 = load float, float* %trzeciaZmienna, align 4
  %3 = fdiv float %1, %2
  store float %3, float* %zmienna, align 4
  ret i32 0
}

attributes #0 = { nounwind uwtable "disable-tail-calls"="false" "less-precise-fpmad"="false" "no-frame-pointer-elim"="true" "no-frame-pointer-elim-non-leaf" "no-infs-fp-math"="false" "no-nans-fp-math"="false" "stack-protector-buffer-size"="8" "target-cpu"="x86-64" "target-features"="+fxsr,+mmx,+sse,+sse2" "unsafe-fp-math"="false" "use-soft-float"="false" }

!llvm.ident = !{!0}

!0 = !{!"clang version 3.8.0-2ubuntu4 (tags/RELEASE_380/final)"}
