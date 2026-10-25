Function GUESSEDrotateentity%()
    Local local0.props
    Local local1#
    local1 = (min((XZ0260X8X2\Field14 * 5.0), 15.0) * sin((Float millisec)))
    For local0 = Each props
        If (local0\Field1 <> 0) Then
            If (((local0\Field5 = playerroom) Lor isroomadjacent(playerroom, local0\Field5)) <> 0) Then
                rotateentity(local0\Field0, local1, entityyaw(local0\Field0, $01, 1.0), entityroll(local0\Field0, $01, 1.0), $01)
            EndIf
        EndIf
    Next
    Return $00
End Function
