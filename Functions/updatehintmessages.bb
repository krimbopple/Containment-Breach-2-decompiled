Function updatehintmessages%()
    Local local0%
    If (T208Z6XX884 <> 0) Then
        Return $00
    EndIf
    local0 = (Int (30.0 * menuscale))
    If (msg\Field1 <> "") Then
        If (0.0 < msg\Field3) Then
            msg\Field4 = min((msg\Field4 + (fps\Field3[$00] * 2.0)), (Float local0))
            msg\Field3 = (msg\Field3 - fps\Field3[$00])
        ElseIf (0.0 < msg\Field4) Then
            msg\Field4 = max((msg\Field4 - (fps\Field3[$00] * 2.0)), 0.0)
        Else
            msg\Field1 = ""
            msg\Field3 = 0.0
            msg\Field4 = 0.0
        EndIf
    EndIf
    Return $00
End Function
