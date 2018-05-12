target datalayout = "e-m:e-i64:64-f80:128-n8:16:32:64-S128"
target triple = "x86_64-pc-linux-gnu"

define i32 @main() #0 {

	%1 = alloca i32, align 4
	%greeting = alloca [23 x i8], align 1
	store i32 0, i32* %1, align 4
	%2 = bitcast [23 x i8]* %greeting to i8*
	call void @llvm.memcpy.p0i8.p0i8.i64(i8* %2, i8* getelementptr inbounds ([23 x i8], [23 x i8]* @main.greeting, i32 0, i32 0), i64 23, i32 1, i1 false)

	%3 = getelementptr inbounds [23 x i8], [23 x i8]* %greeting, i32 0, i32 0
	%4 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i32 0, i32 0), i8* %3
)
	%i = alloca i32, align 4
	store i32 5, i32* %i, align 4

	%j = alloca i32, align 4
	store i32 10, i32* %j, align 4

	%wynik = alloca i32, align 4
	store i32 0, i32* %wynik, align 4

	%5 = load i32, i32* %i, align 4
	%6 = load i32, i32* %j, align 4
	%7 = mul nsw i32 %5, %6
	store i32 %7, i32* %wynik, align 4

	%8 = alloca i32, align 4
	%text = alloca [37 x i8], align 1
	store i32 0, i32* %8, align 4
	%9 = bitcast [37 x i8]* %text to i8*
	call void @llvm.memcpy.p0i8.p0i8.i64(i8* %9, i8* getelementptr inbounds ([37 x i8], [37 x i8]* @main.text, i32 0, i32 0), i64 37, i32 1, i1 false)

	%10 = getelementptr inbounds [37 x i8], [37 x i8]* %text, i32 0, i32 0
	%11 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i32 0, i32 0), i8* %10
)
	%12 = load i32, i32* %wynik, align 4
	%13 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str.1, i32 0, i32 0), i32 %12)

	%14 = alloca i32, align 4
	%text2 = alloca [42 x i8], align 1
	store i32 0, i32* %14, align 4
	%15 = bitcast [42 x i8]* %text2 to i8*
	call void @llvm.memcpy.p0i8.p0i8.i64(i8* %15, i8* getelementptr inbounds ([42 x i8], [42 x i8]* @main.text2, i32 0, i32 0), i64 42, i32 1, i1 false)

	%16 = getelementptr inbounds [42 x i8], [42 x i8]* %text2, i32 0, i32 0
	%17 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i32 0, i32 0), i8* %16
)
	%liczba = alloca i32, align 4
	store i32 0, i32* %liczba, align 4

	%18 = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @.read, i32 0, i32 0), i32* %liczba)

	%r = alloca i32, align 4
	store i32 0, i32* %r, align 4

	%19 = load i32, i32* %j, align 4
	%20 = load i32, i32* %liczba, align 4
	%21 = mul nsw i32 %19, %20
	store i32 %21, i32* %r, align 4

	%22 = alloca i32, align 4
	%text3 = alloca [29 x i8], align 1
	store i32 0, i32* %22, align 4
	%23 = bitcast [29 x i8]* %text3 to i8*
	call void @llvm.memcpy.p0i8.p0i8.i64(i8* %23, i8* getelementptr inbounds ([29 x i8], [29 x i8]* @main.text3, i32 0, i32 0), i64 29, i32 1, i1 false)

	%24 = getelementptr inbounds [29 x i8], [29 x i8]* %text3, i32 0, i32 0
	%25 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i32 0, i32 0), i8* %24
)
	%26 = load i32, i32* %r, align 4
	%27 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str.1, i32 0, i32 0), i32 %26)

	ret i32 0
}

@main.greeting = private unnamed_addr constant [23 x i8] c"Dzien dobry tu program\00", align 1

@main.text = private unnamed_addr constant [37 x i8] c"Wynik mnozenia piec i dziesiec to : \00", align 1

@main.text2 = private unnamed_addr constant [42 x i8] c"Wpisz swoja liczbe do pomnozenia przez 10\00", align 1

@main.text3 = private unnamed_addr constant [29 x i8] c"Wynik Twojego mnozenia to : \00", align 1


@.str = private unnamed_addr constant [4 x i8] c"%s\0A\00", align 1

@.str.1 = private unnamed_addr constant [4 x i8] c"%d\0A\00", align 1
@.read = private unnamed_addr constant [3 x i8] c"%d\00", align 1

declare i32 @printf(i8*, ...) #2

declare i32 @__isoc99_scanf(i8*, ...) #1

declare void @llvm.memcpy.p0i8.p0i8.i64(i8* nocapture, i8* nocapture readonly, i64, i32, i1) #1

attributes #0 = { nounwind uwtable "disable-tail-calls"="false" "less-precise-fpmad"="false" "no-frame-pointer-elim"="true" "no-frame-pointer-elim-non-leaf" "no-infs-fp-math"="false" "no-nans-fp-math"="false" "stack-protector-buffer-size"="8" "target-cpu"="x86-64" "target-features"="+fxsr,+mmx,+sse,+sse2" "unsafe-fp-math"="false" "use-soft-float"="false" }
attributes #1 = { argmemonly nounwind }
attributes #2 = { "disable-tail-calls"="false" "less-precise-fpmad"="false" "no-frame-pointer-elim"="true" "no-frame-pointer-elim-non-leaf" "no-infs-fp-math"="false" "no-nans-fp-math"="false" "stack-protector-buffer-size"="8" "target-cpu"="x86-64" "target-features"="+fxsr,+mmx,+sse,+sse2" "unsafe-fp-math"="false" "use-soft-float"="false" }

!llvm.ident = !{!0}

!0 = !{!"clang version 3.8.0-2ubuntu4 (tags/RELEASE_380/final)"}