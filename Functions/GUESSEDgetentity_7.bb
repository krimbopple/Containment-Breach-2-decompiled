Function GUESSEDgetentity_7%(arg0.TX2BF6X0FF4, arg1#, arg2#, arg3#, arg4.X0442B862F)
    Local local0%
    Local local1#
    Local local2#
    Local local3#
    Local local4#
    Local local5#
    Local local6#
    Local local7#
    Local local8#
    Local local9#
    Local local10#
    Local local11%
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
    Local local24#
    Local local26.TX2BF6X0FF4
    Local local27%
    Local local28%
    Local local29%
    Local local30%
    Local local31#
    Local local32%
    Local local33%
    Local local34$
    Local local35.doors
    Local local36%
    Local local37%
    Local local38%
    Local local39.materials
    Local local40%
    If (arg0 <> Null) Then
        local0 = arg0\Field54
        GUESSEDcallentitypickmode(arg0)
    Else
        local0 = camera
    EndIf
    local1 = entityx(local0, $01, 1.0)
    local2 = entityy(local0, $01, 1.0)
    local3 = entityz(local0, $01, 1.0)
    local4 = entitypitch(local0, $01, 1.0)
    local5 = entityyaw(local0, $01, 1.0)
    blitz_TB8D046D4X0(local1, local2, local3)
    rotateentity(GUESSEDgetglobal_6(), (local4 + arg2), (local5 + arg3), 0.0, $00)
    local6 = arg4\Field51
    If ((((arg4\Field42 = $00) And (arg0 <> Null)) And GUESSEDcheckvalue_2(arg0)) <> 0) Then
        local6 = (local6 * 2.7)
    EndIf
    moveentity(GUESSEDgetglobal_6(), 0.0, 0.0, local6, $00)
    local7 = (entityx(GUESSEDgetglobal_6(), $00, 1.0) - local1)
    local8 = (entityy(GUESSEDgetglobal_6(), $00, 1.0) - local2)
    local9 = (entityz(GUESSEDgetglobal_6(), $00, 1.0) - local3)
    moveentity(GUESSEDgetglobal_6(), 0.0, 0.0, (- local6), $00)
    local10 = ((Float arg4\Field42) * 0.3)
    local11 = linepick(local1, local2, local3, local7, local8, local9, 0.0)
    If (((local11 = $00) And (0.0 < local10)) <> 0) Then
        local12 = local10
        If (local6 < local12) Then
            local12 = local6
        EndIf
        moveentity(GUESSEDgetglobal_6(), 0.0, 0.0, local12, $00)
        local13 = entityx(GUESSEDgetglobal_6(), $00, 1.0)
        local14 = entityy(GUESSEDgetglobal_6(), $00, 1.0)
        local15 = entityz(GUESSEDgetglobal_6(), $00, 1.0)
        moveentity(GUESSEDgetglobal_6(), 0.0, 0.0, (local6 - local12), $00)
        local16 = (entityx(GUESSEDgetglobal_6(), $00, 1.0) - local13)
        local17 = (entityy(GUESSEDgetglobal_6(), $00, 1.0) - local14)
        local18 = (entityz(GUESSEDgetglobal_6(), $00, 1.0) - local15)
        local11 = linepick(local13, local14, local15, local16, local17, local18, local10)
    EndIf
    If (local11 <> $00) Then
        local19 = pickedx()
        local20 = pickedy()
        local21 = pickedz()
        local22 = pickednx()
        local23 = pickedny()
        local24 = pickednz()
        Select left(entityname(pickedentity()), $02)
            Case "N:"
                GUESSEDcreateentity_3($00, arg4, local4, local5, local19, local20, local21, local22, local23, local24, $00, $00)
            Case "P:"
                local26 = (Object.TX2BF6X0FF4 (Int _SplitString(entityname(pickedentity()), ":", $01)))
                If (local26 <> Null) Then
                    tformpoint(local19, local20, local21, $00, pickedentity())
                    getentityshape(pickedentity(), local27, local28, local29, local30, local31, local32)
                    local33 = (tformedy() > ((local31 / entityscaley(pickedentity(), $00, 1.0)) * 0.9))
                    If (((local26\Field13 <> GUESSEDupdatedropitem()) Lor GUESSEDupdateanimatenpc()) <> 0) Then
                        If (local26\Field55\Field5 <> Null) Then
                            GUESSEDcreateentity_3(local26\Field55\Field5\Field46, arg4, local4, local5, local19, local20, local21, local22, local23, local24, (local33 Shl $01), local26\Field13)
                        Else
                            GUESSEDcreateentity_3($00, arg4, local4, (Float local0), local19, local20, local21, local22, local23, local24, $00, local26\Field13)
                        EndIf
                    EndIf
                    If (GUESSEDupdateanimatenpc() <> 0) Then
                        arg1 = (arg1 * (Float ($01 + local33)))
                        If (local26\Field13 = GUESSEDupdatedropitem()) Then
                            GUESSEDcheckvalue_16((arg1 * 0.9), local33, deltayaw(camera, local0))
                        EndIf
                        GUESSEDsendtransformstate(arg0, local26, arg1, local33)
                        GUESSEDplayinjureplayer(local26, arg1, ((Float (local33 = $00)) * 0.5), (Float local33))
                        If (GetPlayerInjuries(local26) >= (8.0 - arg1)) Then
                            If (local26\Field13 = GUESSEDupdatedropitem()) Then
                                kill($01, $01, $00, $01)
                            EndIf
                            GUESSEDcreateentity_13(local26, local33, $00)
                            local34 = ((arg0\Field27 + " killed ") + local26\Field27)
                            If (local33 <> 0) Then
                                local34 = (local34 + " in head")
                            EndIf
                            GUESSEDcheckvalue_43(local34)
                        EndIf
                    EndIf
                    If (((arg0 <> Null) And (arg0\Field13 = GUESSEDupdatedropitem())) <> 0) Then
                        DZ64X028\Field26 = 10.0
                    EndIf
                EndIf
            Default
                If ((GUESSEDupdateanimatenpc() And (left(entityname(pickedentity()), $02) = "B:")) <> 0) Then
                    local35 = (Object.doors (Int _SplitString(entityname(pickedentity()), ":", $01)))
                    If (local35 <> Null) Then
                        If ((((((((local35\Field46 = $00) Lor (local35\Field46 = $02)) Lor (local35\Field46 = $07)) And (local35\Field44 = $00)) And (local35\Field52 = $00)) And (local35\Field21 = $00)) And ((180.0 <= local35\Field13) Lor (0.0 >= local35\Field13))) <> 0) Then
                            openclosedoor(local35, $01, $00)
                        EndIf
                    EndIf
                EndIf
                local36 = $FFFFFFFF
                If (getentitytype(local11) = $01) Then
                    local37 = getsurfacebrush(getsurface(local11, countsurfaces(local11)))
                    If (local37 <> $00) Then
                        local38 = getbrushtexture(local37, $00)
                        If (local38 <> $00) Then
                            local39 = GUESSEDsetmaterials(local38)
                            If (local39 <> Null) Then
                                local36 = local39\Field14
                            EndIf
                        EndIf
                        freebrush(local37)
                    EndIf
                EndIf
                GUESSEDcreateentity_3(local36, arg4, local4, local5, local19, local20, local21, local22, local23, local24, $01, $00)
        End Select
    ElseIf (arg4\Field54 <> "") Then
        local40 = (Int max((Float _CountSplitString(arg4\Field54, " ")), 0.0))
        If (arg0 = TXXF6F02DB2[GUESSEDupdatedropitem()]) Then
            GUESSEDupdatemoving(_SplitString(arg4\Field54, " ", rand($00, (local40 - $01))), 1.0)
        Else
            GUESSEDupdateentity_4(_SplitString(arg4\Field54, " ", rand($00, (local40 - $01))), blitz_TB8D046D4X0(entityx(local0, $01, 1.0), entityy(local0, $01, 1.0), entityz(local0, $01, 1.0)), 6.0, rnd(0.7, 0.8), $00, $00)
        EndIf
    EndIf
    If (arg0 <> Null) Then
        GUESSEDcallentitypickmode_2(arg0)
    EndIf
    Return local11
    Return $00
End Function
