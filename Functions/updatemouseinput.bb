Function updatemouseinput%()
    Local local0%
    Local local1%
    combinekeys($00)
    If (0.0 < input_resettime) Then
        input_resettime = max((input_resettime - fps\Field3[$01]), 0.0)
    Else
        TDD0Z6BXB6\Field0 = $00
        TDD0Z6BXB6\Field7 = mousehit($01)
        TDD0Z6BXB6\Field12 = mousehit($02)
        TDD0Z6BXB6\Field2 = mousehit($03)
        If (TDD0Z6BXB6\Field7 <> 0) Then
            If ((fps\Field2 - TDD0Z6BXB6\Field5) < $12C) Then
                TDD0Z6BXB6\Field0 = $01
            EndIf
            TDD0Z6BXB6\Field5 = millisecs()
        EndIf
        local0 = TDD0Z6BXB6\Field1
        TDD0Z6BXB6\Field1 = mousedown($01)
        TDD0Z6BXB6\Field8 = mousedown($02)
        TDD0Z6BXB6\Field10 = mousedown($03)
        TDD0Z6BXB6\Field3 = (local0 And (TDD0Z6BXB6\Field1 = $00))
    EndIf
    For local1 = $01 To $08 Step $01
        mousehit(local1)
    Next
    Return $00
End Function
