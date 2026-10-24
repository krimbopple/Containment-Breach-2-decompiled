Function teleportcloser%(arg0.npcs)
    Local local0#
    Local local1.waypoints
    Local local2.waypoints
    Local local3#
    Local local4#
    Local local5#
    Local local6%
    Local local7#
    If (((playerinreachableroom($01, $00, $01) = $00) Lor (30.0 < arg0\Field34)) <> 0) Then
        Return $00
    EndIf
    local0 = 0.0
    local4 = (((16.0 - (((Float selecteddifficulty\Field2) * 6.0) * (Float (arg0\Field77 <> $0A)))) - ((Float (arg0\Field77 = $0A)) * 14.0)) * ((16.0 - (((Float selecteddifficulty\Field2) * 6.0) * (Float (arg0\Field77 <> $0A)))) - ((Float (arg0\Field77 = $0A)) * 14.0)))
    For local2 = Each waypoints
        If (local2\Field7 = Null) Then
            If (local2\Field9\Field22\Field21 <> $73) Then
                local3 = distancesquared(entityx(local2\Field0, $01, 1.0), entityx(arg0\Field82, $01, 1.0), entityz(local2\Field0, $01, 1.0), entityz(arg0\Field82, $01, 1.0), 0.0, 0.0)
                If (((1.0 < local3) And (100.0 > local3)) <> 0) Then
                    If (local4 < entitydistancesquared(XZ0260X8X2\Field74, local2\Field0)) Then
                        local5 = entitydistancesquared(XZ0260X8X2\Field74, local2\Field0)
                        If (((local0 > local5) Lor (local1 = Null)) <> 0) Then
                            local0 = local5
                            local1 = local2
                        EndIf
                    EndIf
                EndIf
            EndIf
        EndIf
    Next
    If (local1 <> Null) Then
        local6 = $00
        local7 = entityy(local1\Field0, $01, 1.0)
        If (((arg0\Field24 <> $00) Lor selecteddifficulty\Field2) <> 0) Then
            local6 = $01
        ElseIf (((6.5 >= local7) And (-6.5 <= local7)) <> 0) Then
            local6 = $01
        EndIf
        If (local6 <> 0) Then
            teleportentity(arg0\Field82, entityx(local1\Field0, $01, 1.0), (local7 + 0.22), entityz(local1\Field0, $01, 1.0), (arg0\Field23 + ((Float (arg0\Field77 = $08)) * 0.12)), $01, 4.0, $00)
            arg0\Field90 = local1\Field9
            arg0\Field64 = 0.0
            arg0\Field30 = $00
            arg0\Field8 = 0.0
            arg0\Field48 = $00
        EndIf
    EndIf
    Return $00
End Function
