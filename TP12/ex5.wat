(module
  (import "io" "writestr" (func $writestr (param $strAddr i32)))
  (import "io" "mem" (memory 1))
  

  (func $main
    i32.const 0
    call $writestr 
  )

  (start $main)
  (data (i32.const 0) "ALF\00")
)