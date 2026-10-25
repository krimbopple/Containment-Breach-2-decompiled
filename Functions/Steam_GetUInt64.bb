Function Steam_GetUInt64%(arg0.TX2BF6X0FF4, arg1$)
    Local local0%
    Local local1%
    _Steam_GetUInt64(arg1, local1, local0)
    arg0\Field21\Field3 = arg1
    arg0\Field21\Field2 = local1
    arg0\Field21\Field0 = local0
    Return $00
End Function
