Function updatechunks%(arg0.rooms, arg1%, arg2%)
    Local local0.chunk
    Local local1.chunk
    Local local2.npcs
    Local local3$
    Local local4%
    Local local5%
    Local local6#
    Local local7#
    Local local8#
    Local local9#
    Local local10#
    Local local11#
    Local local12#
    Local local13#
    Local local14#
    Local local15%
    Local local16%
    Local local17%
    Local local18%
    Local local19%
    Local local20.events
    If (arg0\Field27[$00] = $00) Then
        Return $00
    EndIf
    local6 = entityx(XZ0260X8X2\Field74, $00, 1.0)
    local7 = entityy(arg0\Field15, $00, 1.0)
    local8 = entityz(XZ0260X8X2\Field74, $00, 1.0)
    local9 = (Float (Int (clamp(local6, -1000000.0, 1000000.0) / 40.0)))
    local10 = (Float (Int (clamp(local8, -1000000.0, 1000000.0) / 40.0)))
    local11 = (local7 + 0.4)
    local12 = ((local9 * 40.0) + -120.0)
    local13 = ((local10 * 40.0) + -120.0)
    local14 = 14400.0
    local15 = $00
    local16 = _JsonGetArraySize(scp1499chunks)
    Repeat
        local17 = $00
        For local0 = Each chunk
            If (((local12 = local0\Field2) And (local13 = local0\Field7)) <> 0) Then
                local17 = $01
                Exit
            EndIf
        Next
        If (local17 = $00) Then
            local15 = chunkdata[(Int min(((Abs (((local12 + 32.0) / 40.0) Mod 64.0)) + (Abs ((((local13 + 32.0) / 40.0) Mod 64.0) * 64.0))), 4096.0))]
            local1 = createchunk(arg0, local15, local12, local7, local13, $00)
            local1\Field1 = $00
        EndIf
        local12 = (local12 + 40.0)
        If (local12 > ((local9 * 40.0) + 120.0)) Then
            local13 = (local13 + 40.0)
            local12 = ((local9 * 40.0) + -120.0)
        EndIf
    Until (local13 > ((local10 * 40.0) + 120.0))
    For local0 = Each chunk
        If (local0\Field1 = $00) Then
            If (local14 < distancesquared(local6, entityx(local0\Field0, $00, 1.0), local8, entityz(local0\Field0, $00, 1.0), 0.0, 0.0)) Then
                removechunk(local0)
            EndIf
        EndIf
    Next
    local18 = $00
    For local2 = Each npcs
        If (local2\Field77 = $12) Then
            local18 = (local18 + $01)
        EndIf
    Next
    local19 = $20
    For local20 = Each events
        If (local20\Field19 = arg0) Then
            If (local20\Field19\Field32[$00] <> Null) Then
                local19 = $10
                Exit
            EndIf
        EndIf
    Next
    If (local18 < local19) Then
        Select rand($08, $01)
            Case $01
                local2 = createnpc($12, (rnd(40.0, 80.0) + local6), local11, (rnd(40.0, 80.0) + local8))
            Case $02
                local2 = createnpc($12, (rnd(40.0, 80.0) + local6), local11, (rnd(-40.0, 40.0) + local8))
            Case $03
                local2 = createnpc($12, (rnd(40.0, 80.0) + local6), local11, (rnd(-40.0, -80.0) + local8))
            Case $04
                local2 = createnpc($12, (rnd(-40.0, 40.0) + local6), local11, (rnd(-40.0, -80.0) + local8))
            Case $05
                local2 = createnpc($12, (rnd(-40.0, -80.0) + local6), local11, (rnd(-40.0, -80.0) + local8))
            Case $06
                local2 = createnpc($12, (rnd(-40.0, -80.0) + local6), local11, (rnd(-40.0, 40.0) + local8))
            Case $07
                local2 = createnpc($12, (rnd(-40.0, -80.0) + local6), local11, (rnd(40.0, 80.0) + local8))
            Case $08
                local2 = createnpc($12, (rnd(-40.0, 40.0) + local6), local11, (rnd(40.0, 80.0) + local8))
        End Select
        If (rand($02, $01) = $01) Then
            local2\Field65 = 1500.0
        EndIf
        local2\Field84 = rnd(360.0, 0.0)
    Else
        For local2 = Each npcs
            If (local2\Field77 = $12) Then
                If (local2\Field13 = $00) Then
                    If (((local14 < entitydistancesquared(local2\Field82, XZ0260X8X2\Field74)) Lor ((local7 - 5.0) > entityy(local2\Field82, $00, 1.0))) <> 0) Then
                        removenpc(local2)
                    EndIf
                EndIf
            EndIf
        Next
    EndIf
    Return $00
End Function
