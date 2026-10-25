Function GUESSEDsetpoke_3%(arg0.T484FFBZX, arg1%)
    GUESSEDscalebank(arg0, $01)
    pokebyte(arg0\Field3, arg0\Field2, arg1)
    arg0\Field2 = (arg0\Field2 + $01)
    Return $00
End Function
