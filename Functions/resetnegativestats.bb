Function resetnegativestats%(arg0%)
    Local local0%
    Local local1%
    XZ0260X8X2\Field11 = 0.0
    XZ0260X8X2\Field39 = 0.0
    XZ0260X8X2\Field64 = 0.0
    XZ0260X8X2\Field78 = 0.0
    XZ0260X8X2\Field8 = 0.0
    XZ0260X8X2\Field1 = 0.0
    XZ0260X8X2\Field70 = 0.0
    XZ0260X8X2\Field9 = 0.0
    XZ0260X8X2\Field26 = 0.0
    XZ0260X8X2\Field82 = 0.0
    XZ0260X8X2\Field87 = 0.0
    If (1.0 < XZ0260X8X2\Field7) Then
        XZ0260X8X2\Field7 = 1.0
        XZ0260X8X2\Field30 = 0.0
    EndIf
    XZ0260X8X2\Field43 = 0.0
    If (1.0 < XZ0260X8X2\Field65) Then
        XZ0260X8X2\Field65 = 1.0
        XZ0260X8X2\Field34 = 0.0
    EndIf
    XZ0260X8X2\Field56 = XZ0260X8X2\Field6
    For local1 = $00 To $06 Step $01
        i_1025\Field0[local1] = 0.0
    Next
    If (0.0 < i_1025\Field1[$00]) Then
        For local1 = (maxitemamount - $02) To (maxitemamount - $01) Step $01
            If (TX60DB8XBBZ(local1) <> Null) Then
                dropitem(TX60DB8XBBZ(local1), $01)
            EndIf
        Next
        maxitemamount = (maxitemamount - $02)
        i_1025\Field1[$00] = 0.0
    EndIf
    For local1 = $01 To $04 Step $01
        i_1025\Field1[local1] = 0.0
    Next
    If (25200.0 <= i_427\Field1) Then
        i_427\Field1 = 0.0
    EndIf
    i_008\Field0 = 0.0
    i_009\Field0 = 0.0
    i_409\Field0 = 0.0
    i_1048a\Field2 = 0.0
    i_966\Field1 = 0.0
    i_966\Field0 = 0.0
    If (arg0 <> 0) Then
        If (GUESSEDupdatexdb() = $00) Then
            clearcheats()
            If (n_i\Field3 <> Null) Then
                If (1.0 = n_i\Field3\Field31) Then
                    createconsolemsg(format(getlocalstring("console", "revive.by"), "SCP-173", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    chs\Field0 = $01
                    n_i\Field3\Field31 = 0.0
                EndIf
            EndIf
            If (n_i\Field2 <> Null) Then
                If (4.0 > entitydistancesquared(XZ0260X8X2\Field74, n_i\Field2\Field82)) Then
                    createconsolemsg(format(getlocalstring("console", "revive.by"), "SCP-106", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    chs\Field0 = $01
                EndIf
            EndIf
            If (n_i\Field8 <> Null) Then
                If (66.0 <> n_i\Field8\Field66) Then
                    n_i\Field8\Field66 = 1.0
                EndIf
                If (4.0 > entitydistancesquared(XZ0260X8X2\Field74, n_i\Field8\Field82)) Then
                    createconsolemsg(format(getlocalstring("console", "revive.by"), "SCP-049", "%s"), $FFFFFFFF, $FFFFFFFF, $FFFFFFFF, $00)
                    chs\Field0 = $01
                EndIf
            EndIf
        EndIf
        XZ0260X8X2\Field16 = -0.1
        XZ0260X8X2\Field4 = 0.0
        XZ0260X8X2\Field15 = 0.0
        XZ0260X8X2\Field76 = 0.0
        XZ0260X8X2\Field52 = 0.0
        menuopen = $00
        hideentity(XZ0260X8X2\Field28)
        showentity(XZ0260X8X2\Field74)
        XZ0260X8X2\Field48 = 0.0
        XZ0260X8X2\Field36 = $00
        setcrouch($00)
        rotateentity(camera, 0.0, 0.0, 0.0, $01)
    EndIf
    Return $00
End Function
