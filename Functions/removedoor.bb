Function removedoor%(arg0.doors)
    Local local0%
    freeentity(arg0\Field0)
    arg0\Field0 = $00
    If (arg0\Field7 <> $00) Then
        freeentity(arg0\Field7)
        arg0\Field7 = $00
    EndIf
    For local0 = $00 To $01 Step $01
        If (arg0\Field40[local0] <> $00) Then
            freeentity(arg0\Field40[local0])
            arg0\Field40[local0] = $00
        EndIf
        If (arg0\Field24[local0] <> $00) Then
            freeentity(arg0\Field24[local0])
            arg0\Field24[local0] = $00
        EndIf
    Next
    freeentity(arg0\Field51)
    arg0\Field51 = $00
    GUESSEDdeleteremovedoor(arg0)
    Delete arg0
    Return $00
End Function
