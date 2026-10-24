Function Y0X8XD66D6%(arg0.items)
    Local local0%
    If (arg0 = Null) Then
        Return $00
    EndIf
    For local0 = $00 To (arg0\Field36 - $01) Step $01
        If (arg0\Field8[local0] <> Null) Then
            Return $00
        EndIf
    Next
    Return $01
    Return $00
End Function
