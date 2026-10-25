Function GUESSEDupdateobjects_26%(arg0.items, arg1.items)
    Local local0%
    If (arg1 = Null) Then
        Return $00
    EndIf
    For local0 = $00 To (arg1\Field36 - $01) Step $01
        If (arg1\Field8[local0] = Null) Then
            arg1\Field8[local0] = arg0
            Return $01
        EndIf
    Next
    Return $00
    Return $00
End Function
