(module
	(import "io" "writechar" (func $writechar (param $char i32)))  ;; import $io.writechar
	(import "io" "readchar" (func $readchar (result i32)))  ;; import $io.readchar

	(func $uppercase (param $n i32)(result i32)
        get_local $n
        i32.const 32
        i32.sub
    )
	(func $start
		call $readchar
        call $uppercase 
		call $writechar 
	)
	(start $start)
)