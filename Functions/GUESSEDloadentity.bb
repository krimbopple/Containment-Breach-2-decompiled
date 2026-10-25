Function GUESSEDloadentity%(arg0.TX2BF6X0FF4)
    Local local0#
    Local local1$
    Local local2%
    Local local3%
    Local local4%
    Local local5.emitter
    If (((arg0\Field55\Field7 = $00) And (arg0\Field55\Field21 > $00)) <> 0) Then
        local0 = 1.0
        If (0.0 < arg0\Field55\Field6) Then
            local0 = arg0\Field55\Field6
        EndIf
        arg0\Field55\Field5 = GUESSEDcheckvalue_12(arg0\Field55\Field21)
        scaleentity(arg0\Field31, (arg0\Field55\Field5\Field24 * local0), (arg0\Field55\Field5\Field24 * local0), (arg0\Field55\Field5\Field24 * local0), $01)
        If (0.0 < arg0\Field55\Field5\Field42) Then
            If (arg0\Field55\Field20 = $00) Then
                arg0\Field55\Field20 = CreateLight($02, arg0\Field52)
                LightRange(arg0\Field55\Field20, arg0\Field55\Field5\Field42)
                LightColor(arg0\Field55\Field20, arg0\Field55\Field5\Field15, arg0\Field55\Field5\Field51, arg0\Field55\Field5\Field54)
                GUESSEDsetfillroom(arg0\Field55\Field20, arg0\Field55\Field5\Field59)
                GUESSEDcreatenpc_3(arg0\Field55\Field20, arg0\Field55\Field5\Field39)
            EndIf
        ElseIf (arg0\Field55\Field20 <> $00) Then
            freeentity(arg0\Field55\Field20)
            arg0\Field55\Field20 = $00
        EndIf
        If (arg0\Field13 = GUESSEDupdatedropitem()) Then
            If (arg0\Field55\Field5\Field2 > $00) Then
                If (getentitytype(arg0\Field52) <> arg0\Field55\Field5\Field2) Then
                    entitytype(arg0\Field52, arg0\Field55\Field5\Field2, $00)
                    XZ0260X8X2\Field16 = 0.0
                EndIf
            ElseIf (getentitytype(arg0\Field52) <> $02) Then
                entitytype(arg0\Field52, $02, $00)
                XZ0260X8X2\Field16 = 0.0
            EndIf
            Return $00
        EndIf
        arg0\Field55\Field7 = copyentity(GUESSEDgetarray(arg0\Field55\Field21), $00)
        GUESSEDloadmask(arg0\Field55\Field7, (opt\Field76 = $04))
        local1 = GUESSEDgetarray_8(arg0\Field55\Field16)
        If (local1 <> "") Then
            If (GUESSEDcallfiletype_2(local1) <> 0) Then
                entitytexture(arg0\Field55\Field7, loadtexture_strict(local1, $01, $01, 1.0), $00, $00)
            Else
                GUESSEDsetred(("Unable to load texture: " + local1))
            EndIf
        EndIf
        GUESSEDfreeentity_7(arg0\Field55\Field7, $20000, $00)
        entityparent(arg0\Field55\Field7, arg0\Field52, $01)
        positionentity(arg0\Field55\Field7, 0.0, arg0\Field55\Field5\Field56, 0.0, $00)
        scaleentity(arg0\Field55\Field7, (arg0\Field55\Field5\Field24 * local0), (arg0\Field55\Field5\Field24 * local0), (arg0\Field55\Field5\Field24 * local0), $01)
        showentity(arg0\Field52)
        showentity(arg0\Field31)
        arg0\Field55\Field10 = findchild(arg0\Field55\Field7, arg0\Field55\Field5\Field21)
        arg0\Field55\Field13 = findchild(arg0\Field55\Field7, arg0\Field55\Field5\Field30)
        arg0\Field55\Field9 = findchild(arg0\Field55\Field7, arg0\Field55\Field5\Field31)
        arg0\Field55\Field27 = findchild(arg0\Field55\Field7, arg0\Field55\Field5\Field53)
        If (arg0\Field55\Field5\Field28 <> "") Then
            local2 = (_CountSplitString(arg0\Field55\Field5\Field28, " ") - $01)
            For local3 = $00 To local2 Step $01
                local4 = findchild(arg0\Field55\Field7, _SplitString(arg0\Field55\Field5\Field28, " ", local3))
                If (local4 <> $00) Then
                    local5 = setemitter(Null, entityx(local4, $01, 1.0), entityy(local4, $01, 1.0), entityz(local4, $01, 1.0), arg0\Field55\Field5\Field9)
                    If (local5 <> Null) Then
                        entityparent(local5\Field2, local4, $01)
                    EndIf
                EndIf
            Next
        EndIf
        arg0\Field20 = $01
        If (arg0\Field55\Field5\Field34 <> 0) Then
            If (arg0\Field55\Field13 <> $00) Then
                arg0\Field55\Field26 = entityroll(arg0\Field55\Field13, $01, 1.0)
                arg0\Field55\Field11 = entitypitch(arg0\Field55\Field13, $01, 1.0)
            EndIf
            If (arg0\Field55\Field10 <> $00) Then
                arg0\Field55\Field22 = entityroll(arg0\Field55\Field10, $01, 1.0)
            EndIf
        EndIf
        GUESSEDupdateobjects_36(arg0)
    EndIf
    Return $00
End Function
