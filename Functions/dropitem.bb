Function dropitem%(arg0.items, arg1%)
    Local local0#
    Local local1#
    Local local2%
    Local local3#
    Local local4%
    Local local5#
    Local local6#
    Local local7#
    Local local8%
    Local local10%
    Local local11%
    Local local12%
    catcherrors("DropItem()")
    local0 = (XZ0260X8X2\Field84 * 0.1)
    local1 = min(arg0\Field6\Field7\Field0, 8.0)
    local3 = entityyaw(camera, $00, 1.0)
    If (((arg0\Field6\Field5 <> $42) And arg1) <> 0) Then
        playsound_strict(snd_i\Field46[arg0\Field6\Field5], $00, $00)
    EndIf
    arg0\Field30 = $01
    showentity(arg0\Field9)
    If (GUESSEDupdatexdb() = $00) Then
        positionentity(arg0\Field9, entityx(camera, $00, 1.0), entityy(camera, $00, 1.0), entityz(camera, $00, 1.0), $00)
        rotateentity(arg0\Field9, entitypitch(camera, $00, 1.0), (rnd(-20.0, 20.0) + local3), 0.0, $00)
        moveentity(arg0\Field9, 0.07, -0.17, 0.13, $00)
        entitytorque(arg0\Field9, (rnd((- local0), local0) * local1), (rnd((- local0), local0) * local1), (rnd((- local0), local0) * local1))
    Else
        local4 = rndseed()
        seedrnd(((GUESSEDupdatedropitem() + generateseednumber(opt\Field75)) + arg0\Field6\Field23))
        positionentity(arg0\Field9, entityx(camera, $00, 1.0), entityy(camera, $00, 1.0), entityz(camera, $00, 1.0), $00)
        rotateentity(arg0\Field9, entitypitch(camera, $00, 1.0), (rnd(-20.0, 20.0) + local3), 0.0, $00)
        moveentity(arg0\Field9, 0.07, -0.17, 0.13, $00)
        entitytorque(arg0\Field9, (rnd((- local0), local0) * local1), (rnd((- local0), local0) * local1), (rnd((- local0), local0) * local1))
        seedrnd(local4)
    EndIf
    GUESSEDcalculatedirection(entitypitch(camera, $00, 1.0), local3, ((XZ0260X8X2\Field84 * 7.0) * local1), local5, local6, local7)
    entityimpulse(arg0\Field9, local5, local6, local7)
    entityfreeze(arg0\Field9, $00)
    arg0\Field11 = 0.0
    local8 = arg0\Field6\Field9
    Select arg0\Field6\Field9
        Case $3C,$3D,$3E,$3F
            setanimtime(arg0\Field5, 4.0, $00)
        Case $2D,$2E,$13
            local10 = $01
            For local2 = $00 To (arg0\Field36 - $01) Step $01
                If (arg0\Field8[local2] <> Null) Then
                    local10 = $00
                    Exit
                EndIf
            Next
            local11 = arg0\Field6\Field9
            local12 = $00
            If (((local11 = $13) And (local10 = $00)) <> 0) Then
                For local2 = $00 To (arg0\Field36 - $01) Step $01
                    If (arg0\Field8[local2] <> Null) Then
                        local12 = (local12 + $01)
                    EndIf
                Next
            EndIf
            setanimtime(arg0\Field5, ((((((Float (local11 = $2D)) * 17.0) + ((Float (local11 = $2E)) * 2.0)) + ((Float (local11 = $13)) * 11.0)) * (Float local10)) + (((((Float (local11 = $2D)) * 0.0) + (Float (local11 = $2E))) + (max(0.0, (11.0 - (Float local12))) * (Float (local11 = $13)))) * (Float (local10 = $00)))), $00)
        Case $21
            use1123()
        Case $08
            If (((0.0 = i_409\Field0) And (i_427\Field2 = $00)) <> 0) Then
                XZ0260X8X2\Field64 = max(1000.0, XZ0260X8X2\Field64)
                i_409\Field0 = 0.001
            EndIf
    End Select
    arg0\Field28 = $01
    arg0\Field17 = $00
    For local2 = $00 To (maxitemamount - $01) Step $01
        If (TX60DB8XBBZ(local2) = arg0) Then
            TX60DB8XBBZ(local2) = Null
            Exit
        EndIf
    Next
    If (arg1 <> 0) Then
        XZ0260X8X2\Field68 = max(2.0, XZ0260X8X2\Field68)
    EndIf
    GUESSEDsetdropitem(arg0)
    catcherrors("Uncaught: DropItem()")
    Return $00
End Function
