Function AFXX6D6BZ%(arg0.TX2BF6X0FF4)
    If (arg0\Field10 = Null) Then
        Return $00
    EndIf
    TXF26XXBF0B(arg0\Field10\Field7[$00])
    TXF26XXBF0B(arg0\Field10\Field7[$01])
    TXF26XXBF0B(arg0\Field10\Field7[$02])
    Delete arg0\Field10
    Return $00
End Function
