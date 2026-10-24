Function changeoptiontab%(arg0%, arg1%)
    If (arg1 <> 0) Then
        T42DZ064FB\Field0 = arg0
    Else
        igm\Field0 = arg0
        shoulddeletegadgets = $01
    EndIf
    resetinput(10.0)
    Return $00
End Function
