Function X64Z6DBF00%(arg0.TX2BF6X0FF4, arg1.items, arg2#)
    Local local0%
    Local local1#
    Local local2#
    Local local3%
    Local local4#
    Local local5#
    Local local6#
    If (arg1\Field29 = arg0\Field13) Then
        arg0\Field5 = (arg0\Field5 - $01)
        For local0 = $00 To (arg1\Field36 - $01) Step $01
            If (arg1\Field8[local0] <> Null) Then
                arg1\Field8[local0]\Field29 = $00
            EndIf
        Next
        arg1\Field30 = $01
        arg1\Field29 = $00
        arg1\Field17 = $00
        arg1\Field11 = 0.0
        local1 = (0.1 * arg2)
        local2 = min(arg1\Field6\Field7\Field0, 8.0)
        local3 = rndseed()
        seedrnd(((arg0\Field13 + generateseednumber(arg0\Field27)) + arg1\Field6\Field23))
        positionentity(arg1\Field9, entityx(arg0\Field52, $00, 1.0), ((entityy(arg0\Field52, $00, 1.0) + 0.6) + ((Float arg0\Field37) * -0.3)), entityz(arg0\Field52, $00, 1.0), $00)
        showentity(arg1\Field9)
        rotateentity(arg1\Field9, arg0\Field36, (arg0\Field1 + rnd(-20.0, 20.0)), 0.0, $00)
        moveentity(arg1\Field9, 0.07, -0.17, 0.13, $00)
        entitytorque(arg1\Field9, (rnd((- local1), local1) * local2), (rnd((- local1), local1) * local2), (rnd((- local1), local1) * local2))
        seedrnd(local3)
        T62Z0D0XZ(arg0\Field36, arg0\Field1, ((7.0 * arg2) * local2), local4, local5, local6)
        entityimpulse(arg1\Field9, local4, local5, local6)
        Select arg1\Field6\Field9
            Case $3C,$3D,$3E,$3F
                setanimtime(arg1\Field5, 4.0, $00)
        End Select
        If (arg0\Field53 = arg1\Field27) Then
            arg0\Field53 = $00
        EndIf
        Return $01
    EndIf
    Return $00
    Return $00
End Function
