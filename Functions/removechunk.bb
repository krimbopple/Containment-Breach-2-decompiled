Function removechunk%(arg0.chunk)
    Local local0%
    For local0 = $00 To $7F Step $01
        If (arg0\Field4[local0] <> $00) Then
            freeentity(arg0\Field4[local0])
            arg0\Field4[local0] = $00
        EndIf
    Next
    freeentity(arg0\Field6)
    arg0\Field6 = $00
    freeentity(arg0\Field0)
    arg0\Field0 = $00
    Delete arg0
    Return $00
End Function
