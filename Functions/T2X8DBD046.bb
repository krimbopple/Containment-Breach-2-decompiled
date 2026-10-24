Function T2X8DBD046%()
    Local local0%
    Local local1.TX2BF6X0FF4
    Local local2%
    Local local3#
    Local local4#
    Local local5#
    Local local6#
    Local local7#
    Local local9#
    Local local10#
    Local local11#
    Local local12#
    Local local13#
    Local local14#
    If (X4BX024DX0() = $00) Then
        Return $00
    EndIf
    FD020X0BZ\Field2 = (FD020X0BZ\Field2 - fps\Field3[$00])
    If ((((Int XZ0260X8X2\Field48) And (0.0 >= FD020X0BZ\Field2)) And (XZ0260X8X2\Field40 = $FFFFFFFF)) <> 0) Then
        If (FD020X0BZ\Field5 <> 0) Then
            resetnegativestats($00)
            grabbedentity = $00
            handentity = $00
            d_i\Field15 = $00
            d_i\Field6 = Null
            closestitem = Null
            T8660BZ460\Field3 = $00
            T8660BZ460\Field10 = $00
            T8660BZ460\Field6 = $00
            T8660BZ460\Field7 = $00
            T8660BZ460\Field8 = $00
            T8660BZ460\Field11 = $00
            remove714timer = 500.0
            removehazmattimer = 500.0
            hideentity(XZ0260X8X2\Field74)
            XZ0260X8X2\Field76 = 0.0
            XZ0260X8X2\Field64 = 0.0
            XZ0260X8X2\Field11 = 0.0
            XZ0260X8X2\Field39 = 0.0
            XZ0260X8X2\Field64 = 0.0
            XZ0260X8X2\Field82 = 0.0
            XZ0260X8X2\Field87 = 0.0
            XZ0260X8X2\Field53 = 10.0
            XZ0260X8X2\Field16 = 0.0
            XZ0260X8X2\Field52 = 0.0
            If (1.0 < XZ0260X8X2\Field7) Then
                XZ0260X8X2\Field7 = 1.0
                XZ0260X8X2\Field30 = 0.0
            EndIf
            XZ0260X8X2\Field43 = 0.0
            fog\Field13 = 8.0
            chs\Field1 = $00
            chs\Field3 = 0.0
            handentity = $00
            XZ0260X8X2\Field86 = 0.0
            X02B8X204X()
            local0 = (((((invopen Lor i_294\Field4) Lor (otheropen <> Null)) Lor (d_i\Field3 <> Null)) Lor (selectedscreen <> Null)) Lor ((((menuopen Lor consoleopen) Lor (0.0 > XZ0260X8X2\Field2)) Lor TX6X48DXXDX) And (X4BX024DX0() <> $00)))
            If (local0 <> 0) Then
                stopmousemovement()
            ElseIf (((T84F6Z402D\Field2 = $00) And (FD020X0BZ\Field1 < T2FFB8B2F0())) <> 0) Then
                local1 = FD020X0BZ\Field11
                local2 = FD020X0BZ\Field8
                If (keyhit($39) <> 0) Then
                    local2 = (local2 + $01)
                    If (local2 >= $03) Then
                        local2 = $00
                    EndIf
                EndIf
                If (TDD0Z6BXB6\Field7 <> 0) Then
                    local1 = TX20884DD6F(local1, $FFFFFFFF)
                ElseIf (TDD0Z6BXB6\Field12 <> 0) Then
                    local1 = TX20884DD6F(local1, $01)
                EndIf
                If (((local1 <> FD020X0BZ\Field11) Lor (local2 <> FD020X0BZ\Field8)) <> 0) Then
                    If (TXB2BFFFFFX() = $00) Then
                        TXB8BFDBXZ8(local1, local2)
                    Else
                        FD020X0BZ\Field11 = local1
                        FD020X0BZ\Field8 = local2
                    EndIf
                    FD020X0BZ\Field1 = (T2FFB8B2F0() + $FA)
                EndIf
            EndIf
            local3 = (opt\Field65 + 0.5)
            local4 = ((5.0 / (opt\Field65 + 1.0)) * opt\Field39)
            If (0.0 < opt\Field39) Then
                TDD0Z6BXB6\Field13 = curvevalue(((Float (($01 - (opt\Field0 Shl $01)) * mousexspeed())) * local3), TDD0Z6BXB6\Field13, local4)
                If (isnan(TDD0Z6BXB6\Field13) <> 0) Then
                    TDD0Z6BXB6\Field13 = 0.0
                EndIf
                TDD0Z6BXB6\Field14 = curvevalue(((Float (($01 - (opt\Field18 Shl $01)) * mouseyspeed())) * local3), TDD0Z6BXB6\Field14, local4)
                If (isnan(TDD0Z6BXB6\Field14) <> 0) Then
                    TDD0Z6BXB6\Field14 = 0.0
                EndIf
            Else
                TDD0Z6BXB6\Field13 = ((Float (($01 - (opt\Field0 Shl $01)) * mousexspeed())) * local3)
                If (isnan(TDD0Z6BXB6\Field13) <> 0) Then
                    TDD0Z6BXB6\Field13 = 0.0
                EndIf
                TDD0Z6BXB6\Field14 = ((Float (($01 - (opt\Field18 Shl $01)) * mouseyspeed())) * local3)
                If (isnan(TDD0Z6BXB6\Field14) <> 0) Then
                    TDD0Z6BXB6\Field14 = 0.0
                EndIf
            EndIf
            local5 = 0.3
            local6 = (TDD0Z6BXB6\Field13 * local5)
            local7 = (TDD0Z6BXB6\Field14 * local5)
            turnentity(camera, 0.0, (- local6), 0.0, $00)
            camerapitch = (camerapitch + local7)
            camerapitch = clamp(camerapitch, -75.0, 75.0)
            rotateentity(camera, camerapitch, entityyaw(camera, $00, 1.0), 0.0, $00)
            If ((((FD020X0BZ\Field8 = $00) Lor (FD020X0BZ\Field8 = $01)) And (FD020X0BZ\Field1 < T2FFB8B2F0())) <> 0) Then
                local1 = FD020X0BZ\Field11
                local2 = FD020X0BZ\Field8
                If (local1 = Null) Then
                    local1 = TX20884DD6F(Null, $00)
                EndIf
                If (((local1 <> Null) And entityhidden(local1\Field52)) <> 0) Then
                    local1 = TX20884DD6F(local1, $01)
                EndIf
                If ((((local1 = Null) Lor (local1\Field13 = TXXDZB2ZBXX())) Lor entityhidden(local1\Field52)) <> 0) Then
                    local2 = $02
                EndIf
                If (((local1 <> FD020X0BZ\Field11) Lor (local2 <> FD020X0BZ\Field8)) <> 0) Then
                    If (TXB2BFFFFFX() = $00) Then
                        TXB8BFDBXZ8(local1, local2)
                    Else
                        FD020X0BZ\Field11 = local1
                        FD020X0BZ\Field8 = local2
                    EndIf
                    FD020X0BZ\Field1 = (T2FFB8B2F0() + $FA)
                EndIf
            EndIf
            Select FD020X0BZ\Field8
                Case $00
                    If (FD020X0BZ\Field11 <> Null) Then
                        local9 = (entityx(FD020X0BZ\Field11\Field52, $00, 1.0) + (sin((- entityyaw(camera, $00, 1.0))) * -1.0))
                        local10 = ((entityy(FD020X0BZ\Field11\Field52, $00, 1.0) + 0.4) + (tan((- entitypitch(camera, $00, 1.0))) * -1.0))
                        local11 = (entityz(FD020X0BZ\Field11\Field52, $00, 1.0) + (cos((- entityyaw(camera, $00, 1.0))) * -1.0))
                        positionentity(camera, local9, local10, local11, $00)
                        If (XXDB6F64F2[FD020X0BZ\Field11\Field3] <> Null) Then
                            playerroom = XXDB6F64F2[FD020X0BZ\Field11\Field3]
                            showroomsnocoll(playerroom)
                            showroomscoll(playerroom)
                        EndIf
                    EndIf
                Case $01
                    If (FD020X0BZ\Field11 <> Null) Then
                        local12 = 0.0
                        If (FD020X0BZ\Field11\Field48 > $00) Then
                            local12 = (((Float (FD020X0BZ\Field11\Field48 = $02)) * 30.0) + -15.0)
                        EndIf
                        TXDFXDZXXDD\Field19 = curvevalue(local12, TXDFXDZXXDD\Field19, 4.0)
                        positionentity(camera, entityx(FD020X0BZ\Field11\Field50, $01, 1.0), entityy(FD020X0BZ\Field11\Field50, $01, 1.0), entityz(FD020X0BZ\Field11\Field50, $01, 1.0), $00)
                        rotateentity(camera, entitypitch(FD020X0BZ\Field11\Field50, $01, 1.0), entityyaw(FD020X0BZ\Field11\Field50, $01, 1.0), TXDFXDZXXDD\Field19, $00)
                        If (XXDB6F64F2[FD020X0BZ\Field11\Field3] <> Null) Then
                            playerroom = XXDB6F64F2[FD020X0BZ\Field11\Field3]
                            showroomsnocoll(playerroom)
                            showroomscoll(playerroom)
                        EndIf
                        If (FD020X0BZ\Field11\Field55\Field7 <> $00) Then
                            hideentity(FD020X0BZ\Field11\Field55\Field7)
                        EndIf
                    EndIf
                Case $02
                    local13 = max(((Float keydown(key\Field12)) * 2.5), 1.0)
                    local14 = 0.018
                    local4 = (local14 * local13)
                    local4 = (chs\Field5 * local4)
                    If (keydown(key\Field4) <> 0) Then
                        local4 = (local4 * 0.5)
                    EndIf
                    If (local0 = $00) Then
                        If (keydown(key\Field16) <> 0) Then
                            moveentity(camera, 0.0, 0.0, (fps\Field3[$00] * (- local4)), $00)
                        EndIf
                        If (keydown(key\Field5) <> 0) Then
                            moveentity(camera, 0.0, 0.0, (fps\Field3[$00] * local4), $00)
                        EndIf
                        If (keydown(key\Field7) <> 0) Then
                            moveentity(camera, (fps\Field3[$00] * (- local4)), 0.0, 0.0, $00)
                        EndIf
                        If (keydown(key\Field6) <> 0) Then
                            moveentity(camera, (fps\Field3[$00] * local4), 0.0, 0.0, $00)
                        EndIf
                    EndIf
            End Select
            positionentity(XZ0260X8X2\Field74, entityx(camera, $00, 1.0), (entityy(camera, $00, 1.0) - 0.6), entityz(camera, $00, 1.0), $00)
            resetentity(XZ0260X8X2\Field74)
            If (((((((menuopen Lor invopen) Lor consoleopen) Lor i_294\Field4) Lor (otheropen <> Null)) Lor (d_i\Field3 <> Null)) Lor TX6X48DXXDX) = $00) Then
                movemouse(TDD0Z6BXB6\Field6, TDD0Z6BXB6\Field9)
            EndIf
            Return $01
        EndIf
    EndIf
    FD020X0BZ\Field11 = Null
    Return $00
End Function
