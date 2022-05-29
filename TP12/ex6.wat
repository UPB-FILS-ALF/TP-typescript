(module
    (import "io" "readstr" (func $readstr (param $strAddr i32) (param $length i32) (result i32)))
    (import "io" "writestr" (func $writestr (param $strAddr i32)))
    (import "io" "writechar" (func $writechar (param i32))) 
    (import "io" "mem" (memory 1))
    
    (data(i32.const 0) "ALF\00")

    (func $print (param $a i32)
        block $endwhile
            loop $while
                get_local $a
                i32.load8_u
                i32.const 0 
                i32.eq
                br_if $endwhile
                get_local $a
                i32.load8_u
                call $writechar
                get_local $a
                i32.const 1
                i32.add
                set_local $a
                br $while
            end $while
        end $endwhile
    )

	(func $start
	    i32.const 0
        call $print
	)

	(start $start)
)