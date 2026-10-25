Function GUESSEDgetmicroseconds%()
    Local local0%
    Local local1%
    local0 = _GetMicroseconds()
    local1 = (local0 - T408D86286\Field2)
    If (local1 < $00) Then
        local1 = (($7FFE795F - T408D86286\Field2) + local0)
    EndIf
    T408D86286\Field2 = local0
    Return local1
    Return $00
End Function
