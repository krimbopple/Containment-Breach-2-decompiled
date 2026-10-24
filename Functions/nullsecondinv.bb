Function nullsecondinv%(arg0.items)
    Local local0%
    Local local1%
    For local0 = $00 To (arg0\Field36 - $01) Step $01
        If (arg0\Field8[local0] = selecteditem) Then
            XBZ0FD8262(selecteditem, Null)
            selecteditem\Field26 = 35.0
            arg0\Field26 = 35.0
            arg0\Field8[local0] = Null
            Exit
        EndIf
    Next
    local1 = $01
    For local0 = $00 To (arg0\Field36 - $01) Step $01
        If (arg0\Field8[local0] <> Null) Then
            local1 = $00
            Exit
        EndIf
    Next
    If ((local1 And (arg0\Field6\Field10 <> $00)) <> 0) Then
        arg0\Field20 = arg0\Field6\Field10
    EndIf
    Return $00
End Function
