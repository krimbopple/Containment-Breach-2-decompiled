Function TD2XZB8488%()
    Local local0%
    Local local1%
    Local local2.T6068XB4Z2
    Local local3%
    Local local5.TX2BF6X0FF4
    Local local6.T202XXZ0BFD
    Local local7#
    Local local8%
    Local local9#
    Local local10#
    Local local11#
    Local local12#
    Local local13#
    Local local14%
    Local local15#
    Local local16#
    Local local17%
    Local local18.lights
    Local local19#
    Local local20#
    Local local21#
    Local local22.TF2ZXX8FZ
    local0 = createpivot($00)
    local1 = T2FFB8B2F0()
    For local2 = Each T6068XB4Z2
        local2\Field4 = max((local2\Field4 - fps\Field3[$00]), 0.0)
        If (((local2\Field14 = $00) And (countcollisions(local2\Field31) <> $00)) <> 0) Then
            If (0.0 >= local2\Field19) Then
                local2\Field19 = local2\Field35
                If (0.0 = local2\Field19) Then
                    local2\Field19 = -1.0
                EndIf
            EndIf
            If ((local2\Field1 And (0.0 >= local2\Field4)) <> 0) Then
                local3 = collisionentity(local2\Field31, $01)
                local2\Field14 = (local2\Field14 Or $01)
                Select left(entityname(local3), $02)
                    Case "P:"
                        local2\Field14 = (local2\Field14 Or $02)
                        local5 = (Object.TX2BF6X0FF4 (Int T26ZD804D6(entityname(local3), ":", $01)))
                        If (local5 <> Null) Then
                            local2\Field36 = local5\Field13
                            tformpoint(entityx(local2\Field31, $00, 1.0), entityy(local2\Field31, $00, 1.0), entityz(local2\Field31, $00, 1.0), $00, local5\Field52)
                            local2\Field44 = tformedx()
                            local2\Field16 = tformedy()
                            local2\Field46 = tformedz()
                        EndIf
                    Case "O:"
                        local2\Field14 = (local2\Field14 Or $04)
                        local6 = (Object.T202XXZ0BFD (Int T26ZD804D6(entityname(local3), ":", $01)))
                        If (local6 <> Null) Then
                            local2\Field36 = local6\Field5
                            tformpoint(entityx(local2\Field31, $00, 1.0), entityy(local2\Field31, $00, 1.0), entityz(local2\Field31, $00, 1.0), $00, local6\Field0)
                            local2\Field44 = tformedx()
                            local2\Field16 = tformedy()
                            local2\Field46 = tformedz()
                        EndIf
                    Default
                        If (((X4BX024DX0() = $00) Lor TXB2BFFFFFX()) <> 0) Then
                            entityparent(local2\Field31, local3, $01)
                        EndIf
                End Select
                X62DD0204B(local2)
            EndIf
            If (local2\Field2 = Null) Then
                local2\Field22 = (local2\Field22 * (1.0 - local2\Field34))
                local2\Field26 = (local2\Field26 * (1.0 - local2\Field34))
                local2\Field5 = (local2\Field5 * (1.0 - local2\Field34))
                local7 = sqr((((local2\Field22 * local2\Field22) + (local2\Field26 * local2\Field26)) + (local2\Field5 * local2\Field5)))
                If (((0.01 < local7) And (local2\Field41 <> "")) <> 0) Then
                    TZ8Z82X06D(local2\Field41, local2\Field31, 8.0, 0.8, $00, $00)
                EndIf
                For local8 = $01 To countcollisions(local2\Field31) Step $01
                    local9 = collisionnx(local2\Field31, local8)
                    local10 = collisionny(local2\Field31, local8)
                    local11 = collisionnz(local2\Field31, local8)
                    local12 = sqr((((local9 * local9) + (local10 * local10)) + (local11 * local11)))
                    If (0.0 < local12) Then
                        local9 = (local9 / local12)
                        local10 = (local10 / local12)
                        local11 = (local11 / local12)
                    EndIf
                    local13 = ((((local2\Field22 * local9) + (local2\Field26 * local10)) + (local2\Field5 * local11)) * 2.0)
                    local9 = (local9 * local13)
                    local10 = (local10 * local13)
                    local11 = (local11 * local13)
                    local2\Field22 = (local2\Field22 - local9)
                    local2\Field26 = (local2\Field26 - local10)
                    local2\Field5 = (local2\Field5 - local11)
                Next
            Else
                If (((local2\Field41 <> "") And (local2\Field29 < local1)) <> 0) Then
                    For local14 = $01 To countcollisions(local2\Field31) Step $01
                        local7 = collisionimpulse(local2\Field31, local14)
                        local15 = (local7 / local2\Field2\Field0)
                        If (0.1 < local15) Then
                            local16 = clamp((local15 / 2.0), 0.1, 1.0)
                            TZ8Z82X06D(local2\Field41, blitz_TB8D046D4X0(collisionx(local2\Field31, local14), collisiony(local2\Field31, local14), collisionz(local2\Field31, local14)), 8.0, (1.2 * local16), $00, $00)
                            local2\Field29 = (local1 + $FA)
                            Exit
                        EndIf
                    Next
                EndIf
                If (0.0 >= local2\Field4) Then
                    entitytype(local2\Field31, $03, $00)
                EndIf
            EndIf
        EndIf
        If (local2\Field14 <> $00) Then
            entityfreeze(local2\Field31, $01)
            If ((local2\Field14 And $02) <> $00) Then
                local5 = TXXF6F02DB2[(Int clamp((Float local2\Field36), 0.0, 255.0))]
                If (((local5 <> Null) And (entityhidden(local5\Field52) = $00)) <> 0) Then
                    tformpoint(local2\Field44, local2\Field16, local2\Field46, local5\Field52, $00)
                    positionentity(local2\Field31, tformedx(), tformedy(), tformedz(), $01)
                Else
                    local2\Field42 = 0.01
                EndIf
            ElseIf ((local2\Field14 And $04) <> $00) Then
                TX064ZDF0XD($02, local2\Field36)
                local6 = eax_02B5
                If (local6 <> Null) Then
                    tformpoint(local2\Field44, local2\Field16, local2\Field46, local6\Field0, $00)
                    positionentity(local2\Field31, tformedx(), tformedy(), tformedz(), $01)
                Else
                    local2\Field42 = 0.01
                EndIf
            ElseIf (((X4BX024DX0() = $00) Lor TXB2BFFFFFX()) = $00) Then
                positionentity(local2\Field31, local2\Field0, local2\Field33, local2\Field7, $01)
            EndIf
        ElseIf (local2\Field2 = Null) Then
            positionentity(local0, entityx(local2\Field31, $00, 1.0), entityy(local2\Field31, $00, 1.0), entityz(local2\Field31, $00, 1.0), $00)
            local2\Field26 = (local2\Field26 - ((local2\Field20 / 9.8) * fps\Field3[$00]))
            translateentity(local2\Field31, (local2\Field22 * fps\Field3[$00]), (local2\Field26 * fps\Field3[$00]), (local2\Field5 * fps\Field3[$00]), $00)
            pointentity(local0, local2\Field31, 0.0)
            rotateentity(local2\Field31, clamp(curvevalue(entitypitch(local0, $00, 1.0), entitypitch(local2\Field31, $00, 1.0), 4.0), -89.9, 89.9), curveangle(entityyaw(local0, $00, 1.0), entityyaw(local2\Field31, $00, 1.0), 4.0), curveangle(entityroll(local0, $00, 1.0), entityroll(local2\Field31, $00, 1.0), 4.0), $00)
        EndIf
        local17 = local2\Field39
        If (local17 <> $01) Then
            If (local2\Field45 <> $00) Then
                freeentity(local2\Field45)
                local2\Field45 = $00
            EndIf
        Else
            local2\Field27 = (local2\Field27 - fps\Field3[$00])
            If (0.0 >= local2\Field27) Then
                For local18 = Each lights
                    If ((local18\Field14 And (local2\Field32 > entitydistance(local18\Field7, local2\Field31))) <> 0) Then
                        local18\Field2 = max(2.0, local18\Field2)
                    EndIf
                Next
                local2\Field27 = 35.0
            EndIf
            If (local2\Field45 = $00) Then
                local2\Field45 = CreateLight($02, local2\Field31)
                LightRange(local2\Field45, 0.7)
                TX48B0X22Z(local2\Field45, 1.2)
                LightColor(local2\Field45, $00, $A2, $E8)
                TX2026B22F(local2\Field45, $00)
            EndIf
        EndIf
        If (((X4BX024DX0() = $00) Lor TXB2BFFFFFX()) <> 0) Then
            If (0.0 < local2\Field42) Then
                local2\Field42 = (local2\Field42 - fps\Field3[$00])
                If (0.0 >= local2\Field42) Then
                    local2\Field19 = 0.01
                EndIf
            EndIf
            If (0.0 < local2\Field19) Then
                local2\Field19 = max((local2\Field19 - fps\Field3[$00]), 0.0)
                If (0.0 = local2\Field19) Then
                    Z0ZB28XFX(local2)
                    Goto section__5913
                EndIf
            EndIf
        ElseIf (((local2\Field2 <> Null) And (local2\Field14 = $00)) <> 0) Then
            local2\Field11 = max((local2\Field11 - fps\Field3[$00]), 0.0)
            If (0.0 >= local2\Field11) Then
                local19 = (local2\Field0 - entityx(local2\Field31, $01, 1.0))
                local20 = (local2\Field33 - entityy(local2\Field31, $01, 1.0))
                local21 = (local2\Field7 - entityz(local2\Field31, $01, 1.0))
                If (0.3 < (((local19 * local19) + (local20 * local20)) + (local21 * local21))) Then
                    positionentity(local2\Field31, local2\Field0, local2\Field33, local2\Field7, $01)
                    rotateentity(local2\Field31, 0.0, entityyaw(local2\Field31, $00, 1.0), 0.0, $01)
                    entitylinearvelocity(local2\Field31, 0.0, 0.0, 0.0)
                    entityangularvelocity(local2\Field31, 0.0, 0.0, 0.0)
                    entityfreeze(local2\Field31, $01)
                Else
                    entitylinearvelocity(local2\Field31, (local19 * 0.1), (local20 * 0.1), (local21 * 0.1))
                    entityfreeze(local2\Field31, $00)
                EndIf
            EndIf
        EndIf
        If (local2\Field17 <> $00) Then
            If (ChannelPlaying(local2\Field28) = $00) Then
                local22 = TZ8Z82X06D(local2\Field15, local2\Field31, 8.0, 1.0, $00, $00)
                If (local22 <> Null) Then
                    local2\Field28 = local22\Field8
                    local2\Field25 = local22\Field6
                EndIf
            ElseIf (entityexist(local2\Field25) <> 0) Then
                positionentity(local2\Field25, entityx(local2\Field31, $01, 1.0), entityy(local2\Field31, $01, 1.0), entityz(local2\Field31, $01, 1.0), $01)
            EndIf
        EndIf
        If ((((local2\Field10 = $00) And ((X4BX024DX0() <> $00) And (TXB2BFFFFFX() = $00))) And (T2FFB8B2F0() > local2\Field13)) <> 0) Then
            Z0ZB28XFX(local2)
.section__5913
        EndIf
    Next
    freeentity(local0)
    Return $00
End Function
