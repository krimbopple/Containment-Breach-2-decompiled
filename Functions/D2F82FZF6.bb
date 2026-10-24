Function D2F82FZF6%()
    Local local0.TB8DZX8886
    Local local1#
    Local local2#
    For local0 = Each TB8DZX8886
        If (((0.1 < secondarylighton) And ((local0\Field1 = playerroom) Lor (10.0 > local0\Field1\Field39))) <> 0) Then
            local1 = entitydistancesquared(camera, local0\Field3)
            local2 = (((local0\Field4 * local0\Field4) + (lightrenderdistance * lightrenderdistance)) * lightvolume)
            If (local2 > local1) Then
                If (entityhidden(local0\Field0) <> 0) Then
                    showentity(local0\Field0)
                EndIf
                If (entityhidden(local0\Field5) <> 0) Then
                    showentity(local0\Field5)
                EndIf
                turnentity(local0\Field3, local0\Field6, 0.0, 0.0, $00)
            Else
                If (entityhidden(local0\Field0) = $00) Then
                    hideentity(local0\Field0)
                EndIf
                If (entityhidden(local0\Field5) = $00) Then
                    hideentity(local0\Field5)
                EndIf
            EndIf
        Else
            If (entityhidden(local0\Field0) = $00) Then
                hideentity(local0\Field0)
            EndIf
            If (entityhidden(local0\Field5) = $00) Then
                hideentity(local0\Field5)
            EndIf
        EndIf
    Next
    Return $00
End Function
