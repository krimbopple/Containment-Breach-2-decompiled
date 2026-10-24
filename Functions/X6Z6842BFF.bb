Function X6Z6842BFF%(arg0.T202XXZ0BFD)
    If (arg0 = Null) Then
        Return $00
    EndIf
    If (handentity = arg0\Field0) Then
        handentity = $00
    EndIf
    freeentity(arg0\Field9)
    If (arg0\Field0 <> $00) Then
        freeentity(arg0\Field0)
    EndIf
    TX0DFFXFDD8($02, arg0\Field5, arg0, $FFFFFFFF)
    Delete arg0
    Return $00
End Function
