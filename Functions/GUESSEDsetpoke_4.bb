Function GUESSEDsetpoke_4%(arg0.T484FFBZX, arg1#)
    GUESSEDscalebank(arg0, $04)
    pokefloat(arg0\Field3, arg0\Field2, arg1)
    arg0\Field2 = (arg0\Field2 + $04)
    Return $00
End Function
