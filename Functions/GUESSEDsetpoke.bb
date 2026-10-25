Function GUESSEDsetpoke%(arg0.T484FFBZX, arg1%)
    GUESSEDscalebank(arg0, $02)
    pokeshort(arg0\Field3, arg0\Field2, arg1)
    arg0\Field2 = (arg0\Field2 + $02)
    Return $00
End Function
