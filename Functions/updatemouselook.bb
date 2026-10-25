Function updatemouselook%()
    Local local0.TX2BF6X0FF4
    Local local1%
    Local local2%
    Local local3#
    Local local4#
    Local local5.X44ZF6442X
    Local local6%
    Local local7%
    Local local8#
    Local local9#
    Local local10#
    Local local11#
    Local local12#
    Local local13#
    Local local14#
    Local local15#
    Local local16#
    Local local17#
    Local local18#
    Local local19#
    Local local20#
    Local local21#
    Local local22#
    Local local23#
    Local local24%
    Local local25%
    catcherrors("UpdateMouseLook()")
    local0 = TXXF6F02DB2[GUESSEDupdatedropitem()]
    local1 = $01
    local2 = $01
    local3 = 0.0
    local4 = 1.0
    If (local0 <> Null) Then
        local5 = local0\Field55\Field5
        If (local5 <> Null) Then
            local1 = (local5\Field3 = $00)
            local2 = (local5\Field33 = $00)
            local3 = local5\Field38
            If (0.0 < local0\Field55\Field6) Then
                local4 = local0\Field55\Field6
            EndIf
        EndIf
    EndIf
    local8 = (fps\Field3[$00] / 10.0)
    XZ0260X8X2\Field1 = max((XZ0260X8X2\Field1 - local8), 0.0)
    XZ0260X8X2\Field14 = max((XZ0260X8X2\Field14 - local8), 0.0)
    If (0.0 < XZ0260X8X2\Field14) Then
        GUESSEDrotateentity()
    EndIf
    If ((TDD0Z6BXB6\Field10 And (0.0001 > XZ0260X8X2\Field13)) <> 0) Then
        XZ0260X8X2\Field81 = curvevalue(0.35, XZ0260X8X2\Field81, 7.0)
    Else
        XZ0260X8X2\Field81 = curvevalue(0.0, XZ0260X8X2\Field81, 6.0)
    EndIf
    camerazoom(camera, ((((min(((XZ0260X8X2\Field51 / 400.0) + 1.0), 1.1) + (XZ0260X8X2\Field13 / 400.0)) / camerazoomvalue) + XZ0260X8X2\Field81) - (XZ0260X8X2\Field79 * 0.12)))
    XZ0260X8X2\Field51 = max((XZ0260X8X2\Field51 - fps\Field3[$00]), 0.0)
    If (((0.0 = XZ0260X8X2\Field48) And (0.0 <= XZ0260X8X2\Field52)) <> 0) Then
        XZ0260X8X2\Field4 = 0.0
        If (isnan(entityx(XZ0260X8X2\Field74, $00, 1.0)) <> 0) Then
            positionentity(XZ0260X8X2\Field74, entityx(camera, $01, 1.0), (entityy(camera, $01, 1.0) - 0.5), entityz(camera, $01, 1.0), $01)
            createconsolemsg(format(getlocalstring("console", "xyz.reset"), (Str entityx(XZ0260X8X2\Field74, $00, 1.0)), "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
        EndIf
        local9 = (((sin(XZ0260X8X2\Field15) * (Float local1)) / ((XZ0260X8X2\Field46 * 20.0) + 20.0)) * 0.6)
        local10 = (clamp(((min(((XZ0260X8X2\Field11 * (1.0 - ((Float (0.0 < i_1025\Field1[$03])) * 0.75))) + 0.25), 3.0) * (Float local2)) * (sin((XZ0260X8X2\Field15 / 2.0)) * 2.5)), -8.0, 8.0) + XZ0260X8X2\Field58)
        If (XZ0260X8X2\Field38 <> $01) Then
            rotateentity(camera, entitypitch(XZ0260X8X2\Field74, $00, 1.0), entityyaw(XZ0260X8X2\Field74, $00, 1.0), (local10 / 2.0), $00)
            local11 = entityyaw(camera, $00, 1.0)
            positionentity(camera, (entityx(XZ0260X8X2\Field74, $00, 1.0) - ((XZ0260X8X2\Field58 * cos(local11)) * 0.0055)), ((entityy(XZ0260X8X2\Field74, $00, 1.0) + (local9 * local4)) + ((((XZ0260X8X2\Field46 * -0.3) + 0.6) + local3) * local4)), (entityz(XZ0260X8X2\Field74, $00, 1.0) - ((XZ0260X8X2\Field58 * sin(local11)) * 0.0055)), $00)
            local12 = (opt\Field65 + 0.5)
            local13 = ((5.0 / (opt\Field65 + 1.0)) * opt\Field39)
            TDD0Z6BXB6\Field13 = curvevalue(((Float (($01 - (opt\Field0 Shl $01)) * mousexspeed())) * local12), TDD0Z6BXB6\Field13, local13)
            If (isnan(TDD0Z6BXB6\Field13) <> 0) Then
                TDD0Z6BXB6\Field13 = 0.0
            EndIf
            TDD0Z6BXB6\Field14 = curvevalue(((Float (($01 - (opt\Field18 Shl $01)) * mouseyspeed())) * local12), TDD0Z6BXB6\Field14, local13)
            If (isnan(TDD0Z6BXB6\Field14) <> 0) Then
                TDD0Z6BXB6\Field14 = 0.0
            EndIf
            TDD0Z6BXB6\Field11 = curvevalue(TDD0Z6BXB6\Field13, TDD0Z6BXB6\Field11, 25.0)
            TDD0Z6BXB6\Field4 = curvevalue(TDD0Z6BXB6\Field14, TDD0Z6BXB6\Field4, 25.0)
            If ((((((invopen Lor i_294\Field4) Lor (otheropen <> Null)) Lor (d_i\Field3 <> Null)) Lor (selectedscreen <> Null)) Lor ((((menuopen Lor consoleopen) Lor (0.0 > XZ0260X8X2\Field2)) Lor TX6X48DXXDX) And (GUESSEDupdatexdb() <> $00))) <> 0) Then
                stopmousemovement()
            EndIf
            local14 = (TDD0Z6BXB6\Field13 * 0.3)
            local15 = (TDD0Z6BXB6\Field14 * 0.3)
            turnentity(XZ0260X8X2\Field74, 0.0, (- local14), 0.0, $00)
            camerapitch = (camerapitch + local15)
            camerapitch = clamp(camerapitch, -75.0, 75.0)
        EndIf
        local16 = ((XZ0260X8X2\Field1 + XZ0260X8X2\Field14) + (XZ0260X8X2\Field79 * 2.0))
        local17 = (sin((DZ64X028\Field55 * 10.0)) * 40.0)
        local18 = (cos((Float DZ64X028\Field5)) * local17)
        local19 = (sin((Float DZ64X028\Field5)) * local17)
        local20 = local19
        local21 = GUESSEDupdateentity($01)
        local22 = GUESSEDupdateentity_3($01)
        local23 = GUESSEDupdateentity_7($01)
        XZ0260X8X2\Field5 = curvevalue(0.0, XZ0260X8X2\Field5, 8.0)
        XZ0260X8X2\Field41 = curvevalue(XZ0260X8X2\Field5, XZ0260X8X2\Field41, 6.0)
        rotateentity(camera, clamp(((((rnd((- local16), local16) + camerapitch) + local18) + local21) + XZ0260X8X2\Field41), -89.9, 89.9), wrapangle((((entityyaw(XZ0260X8X2\Field74, $00, 1.0) + rnd((- local16), local16)) + local19) + local22), 360.0), (((local10 + local20) * (Float local1)) + local23), $00)
        If (playerroom\Field22\Field21 = $6F) Then
            If (((pd_event <> Null) And (5.0 <> pd_event\Field7)) <> 0) Then
                rotateentity(camera, wrapangle(entitypitch(camera, $00, 1.0), 360.0), wrapangle(entityyaw(camera, $00, 1.0), 360.0), (wrapangle((sin(((Float millisec) / 150.0)) * 30.0), 360.0) + local10), $00)
            EndIf
        EndIf
        If (((((((menuopen Lor invopen) Lor consoleopen) Lor i_294\Field4) Lor (otheropen <> Null)) Lor (d_i\Field3 <> Null)) Lor TX6X48DXXDX) = $00) Then
            movemouse(TDD0Z6BXB6\Field6, TDD0Z6BXB6\Field9)
        EndIf
    ElseIf (((((FD020X0BZ\Field5 And (0.0 >= FD020X0BZ\Field2)) = $00) Lor (GUESSEDupdatexdb() = $00)) Lor ((0.0 > XZ0260X8X2\Field52) And (0.0 = XZ0260X8X2\Field48))) <> 0) Then
        If (entityhidden(XZ0260X8X2\Field74) = $00) Then
            hideentity(XZ0260X8X2\Field74)
        EndIf
        If (0.0 = XZ0260X8X2\Field48) Then
            translateentity(XZ0260X8X2\Field74, 0.0, (fps\Field3[$00] * -0.0002), 0.0, $00)
            resetentity(XZ0260X8X2\Field74)
        EndIf
        positionentity(camera, entityx(XZ0260X8X2\Field28, $00, 1.0), entityy(XZ0260X8X2\Field28, $00, 1.0), entityz(XZ0260X8X2\Field28, $00, 1.0), $00)
        local24 = $00
        local25 = countcollisions(XZ0260X8X2\Field28)
        For local7 = $01 To local25 Step $01
            If (collisiony(XZ0260X8X2\Field28, local7) < (entityy(XZ0260X8X2\Field28, $00, 1.0) - 0.01)) Then
                local24 = $01
                Exit
            EndIf
        Next
        If (local24 <> 0) Then
            XZ0260X8X2\Field4 = 0.0
        Else
            If (XZ0260X8X2\Field36 = $00) Then
                moveentity(XZ0260X8X2\Field28, 0.0, 0.0, XZ0260X8X2\Field4, $00)
                rotateentity(XZ0260X8X2\Field28, curveangle(-89.9, entitypitch(XZ0260X8X2\Field28, $00, 1.0), 20.0), entityyaw(XZ0260X8X2\Field28, $00, 1.0), entityroll(XZ0260X8X2\Field28, $00, 1.0), $00)
                rotateentity(camera, curveangle((entitypitch(XZ0260X8X2\Field28, $00, 1.0) - 40.0), entitypitch(camera, $00, 1.0), 40.0), entityyaw(camera, $00, 1.0), entityroll(camera, $00, 1.0), $00)
            Else
                moveentity(XZ0260X8X2\Field28, 0.0, 0.0, (- XZ0260X8X2\Field4), $00)
                rotateentity(XZ0260X8X2\Field28, curveangle(89.9, entitypitch(XZ0260X8X2\Field28, $00, 1.0), 20.0), entityyaw(XZ0260X8X2\Field28, $00, 1.0), entityroll(XZ0260X8X2\Field28, $00, 1.0), $00)
                rotateentity(camera, curveangle((entitypitch(XZ0260X8X2\Field28, $00, 1.0) + 40.0), entitypitch(camera, $00, 1.0), 40.0), entityyaw(camera, $00, 1.0), entityroll(camera, $00, 1.0), $00)
            EndIf
            XZ0260X8X2\Field4 = (XZ0260X8X2\Field4 - (fps\Field3[$00] * 0.002))
        EndIf
    EndIf
    updatedust()
    If ((((T8660BZ460\Field3 > $00) Lor (T8660BZ460\Field10 > $00)) Lor (i_1499\Field8 > $00)) <> 0) Then
        If (entityhidden(X2Z260BF0Z\Field1[((T8660BZ460\Field10 > $00) + $01)]) <> 0) Then
            showentity(X2Z260BF0Z\Field1[((T8660BZ460\Field10 > $00) + $01)])
        EndIf
        If (0.0 = XZ0260X8X2\Field48) Then
            If (ChannelPlaying(breathchn) <> 0) Then
                If (ChannelPlaying(breathgasrelaxedchn) <> 0) Then
                    StopChannel(breathgasrelaxedchn)
                    breathgasrelaxedchn = $00
                EndIf
            ElseIf (ChannelPlaying(breathgasrelaxedchn) = $00) Then
                breathgasrelaxedchn = playsound_strict(snd_i\Field41, $01, $00)
            EndIf
        EndIf
        If (((((T8660BZ460\Field3 <> $02) And (T8660BZ460\Field3 <> $04)) And (T8660BZ460\Field10 <> $02)) And (T8660BZ460\Field10 <> $04)) <> 0) Then
            If (ChannelPlaying(breathchn) <> 0) Then
                T8660BZ460\Field0 = min(((fps\Field3[$00] * rnd(0.5, 1.6)) + T8660BZ460\Field0), 100.0)
            Else
                T8660BZ460\Field0 = max(0.0, (T8660BZ460\Field0 - (fps\Field3[$00] * 0.3)))
            EndIf
            If (((0.0 < T8660BZ460\Field0) And ((-6.0 < XZ0260X8X2\Field53) Lor (-11.0 > XZ0260X8X2\Field53))) <> 0) Then
                entityalpha(X2Z260BF0Z\Field1[$09], min((((T8660BZ460\Field0 * 0.2) * (T8660BZ460\Field0 * 0.2)) / 1000.0), 0.45))
                If (entityhidden(X2Z260BF0Z\Field1[$09]) <> 0) Then
                    showentity(X2Z260BF0Z\Field1[$09])
                EndIf
            ElseIf (entityhidden(X2Z260BF0Z\Field1[$09]) = $00) Then
                hideentity(X2Z260BF0Z\Field1[$09])
            EndIf
        EndIf
    Else
        If (ChannelPlaying(breathgasrelaxedchn) <> 0) Then
            StopChannel(breathgasrelaxedchn)
            breathgasrelaxedchn = $00
        EndIf
        T8660BZ460\Field0 = max(0.0, (T8660BZ460\Field0 - (fps\Field3[$00] * 0.3)))
        If (entityhidden(X2Z260BF0Z\Field1[$01]) = $00) Then
            hideentity(X2Z260BF0Z\Field1[$01])
        EndIf
        If (entityhidden(X2Z260BF0Z\Field1[$02]) = $00) Then
            hideentity(X2Z260BF0Z\Field1[$02])
        EndIf
        If (entityhidden(X2Z260BF0Z\Field1[$09]) = $00) Then
            hideentity(X2Z260BF0Z\Field1[$09])
        EndIf
    EndIf
    If (((T8660BZ460\Field8 > $00) Lor (T8660BZ460\Field11 > $00)) <> 0) Then
        If (entityhidden(X2Z260BF0Z\Field1[$04]) <> 0) Then
            showentity(X2Z260BF0Z\Field1[$04])
        EndIf
        If (entityhidden(X2Z260BF0Z\Field1[$00]) = $00) Then
            hideentity(X2Z260BF0Z\Field1[$00])
        EndIf
        Select T8660BZ460\Field8
            Case $00
                entitycolor(X2Z260BF0Z\Field1[$04], 200.0, 200.0, 200.0)
            Case $01
                entitycolor(X2Z260BF0Z\Field1[$04], 0.0, 200.0, 0.0)
            Case $02
                entitycolor(X2Z260BF0Z\Field1[$04], 0.0, 100.0, 200.0)
            Case $03
                entitycolor(X2Z260BF0Z\Field1[$04], 200.0, 0.0, 0.0)
        End Select
    Else
        If (entityhidden(X2Z260BF0Z\Field1[$04]) = $00) Then
            hideentity(X2Z260BF0Z\Field1[$04])
        EndIf
        If ((entityhidden(X2Z260BF0Z\Field1[$00]) And opt\Field23) <> 0) Then
            showentity(X2Z260BF0Z\Field1[$00])
        EndIf
    EndIf
    If (T8660BZ460\Field7 = $02) Then
        If (entityhidden(X2Z260BF0Z\Field1[$08]) <> 0) Then
            showentity(X2Z260BF0Z\Field1[$08])
        EndIf
    ElseIf (entityhidden(X2Z260BF0Z\Field1[$08]) = $00) Then
        hideentity(X2Z260BF0Z\Field1[$08])
    EndIf
    catcherrors("Uncaught: UpdateMouseLook()")
    Return $00
End Function
