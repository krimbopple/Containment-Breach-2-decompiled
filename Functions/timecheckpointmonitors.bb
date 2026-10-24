Function timecheckpointmonitors%()
    Local local0%
    For local0 = $00 To $01 Step $01
        If (mon_i\Field1[local0] <> 0) Then
            If (100.0 > mon_i\Field0[local0]) Then
                mon_i\Field0[local0] = (mon_i\Field0[local0] + fps\Field3[$00])
            Else
                mon_i\Field0[local0] = 0.0
            EndIf
        EndIf
    Next
    Return $00
End Function
