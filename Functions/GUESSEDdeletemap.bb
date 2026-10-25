Function GUESSEDdeletemap%(arg0.X2B8DB2B8X)
    If (arg0 = Null) Then
        Return $00
    EndIf
    FreeSound(arg0\Field1)
    arg0\Field1 = $00
    _S2IMapErase(TXZ8ZB88X62, arg0\Field0)
    Delete arg0
    Return $00
End Function
