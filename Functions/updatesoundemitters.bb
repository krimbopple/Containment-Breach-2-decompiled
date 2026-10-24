Function updatesoundemitters%()
    Local local0.soundemitters
    For local0 = Each soundemitters
        If (local0\Field4 <> Null) Then
            If (((6.0 > local0\Field4\Field39) Lor (local0\Field4 = playerroom)) <> 0) Then
                If ((local0\Field1 * local0\Field1) > entitydistancesquared(local0\Field3, XZ0260X8X2\Field74)) Then
                    local0\Field2 = loopsoundex(roomambience[(local0\Field0 - $01)], local0\Field2, camera, local0\Field3, local0\Field1, 1.0, $00)
                EndIf
            EndIf
        EndIf
    Next
    Return $00
End Function
