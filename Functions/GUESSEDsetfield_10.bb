Function GUESSEDsetfield_10%(arg0.events)
    Local local0%
    If (arg0\Field19 = Null) Then
        Return $00
    EndIf
    For local0 = $00 To $0F Step $01
        If (arg0\Field19\Field32[local0] <> Null) Then
            arg0\Field19\Field32[local0]\Field75 = arg0\Field25
            arg0\Field19\Field32[local0]\Field89 = local0
        EndIf
    Next
    Return $00
End Function
