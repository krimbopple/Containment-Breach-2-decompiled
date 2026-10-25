Function GUESSEDloadimage%(arg0$, arg1$, arg2$)
    Local local0.FF82FZXF4
    local0 = (New FF82FZXF4)
    local0\Field2 = loadimage_strict(arg0)
    resizeimage(local0\Field2, (Int (100.0 * menuscale)), (Int (70.0 * menuscale)))
    local0\Field1 = arg1
    local0\Field0 = arg2
    Return $00
End Function
