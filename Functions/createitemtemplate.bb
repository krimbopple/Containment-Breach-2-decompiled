Function createitemtemplate.itemtemplates(arg0$, arg1$, arg2%, arg3$, arg4$, arg5$, arg6#, arg7%, arg8$, arg9$, arg10%, arg11%)
    Local local0.itemtemplates
    Local local1.itemtemplates
    Local local2%
    local0 = (New itemtemplates)
    arg3 = ("GFX\Items\" + arg3)
    For local1 = Each itemtemplates
        If (((local1\Field16 = arg3) And (local1\Field21 <> $00)) <> 0) Then
            local0\Field21 = copyentity(local1\Field21, $00)
            If (animlength(local0\Field21) < $00) Then
                local0\Field0 = TXZDB8BD842(local0\Field21)
            EndIf
            Exit
        EndIf
    Next
    If (local0\Field21 = $00) Then
        If (arg10 <> 0) Then
            local0\Field21 = loadanimmesh_strict(arg3, $00, (instr(arg3, "addons", $01) < $01))
        Else
            local0\Field21 = TF828B4FB6(arg3, "")
        EndIf
    EndIf
    local0\Field20 = arg10
    local0\Field16 = arg3
    local2 = $00
    If (arg8 <> "") Then
        If (((arg8 = arg5) And (filetype(("GFX\Items\" + arg8)) = $00)) <> 0) Then
            arg8 = ("GFX\Items\HUD Textures\" + arg8)
        Else
            arg8 = ("GFX\Items\" + arg8)
        EndIf
        For local1 = Each itemtemplates
            If (((local1\Field13 = arg8) And (local1\Field22 <> $00)) <> 0) Then
                local2 = local1\Field22
                Exit
            EndIf
        Next
        If (local2 = $00) Then
            local2 = loadtexture_strict(arg8, arg11, $00, 1.0)
            local0\Field13 = arg8
            entitytexture(local0\Field21, local2, $00, $00)
            local0\Field22 = local2
            X8F80Z2886(local0\Field21, $FFFFFFFF, $00)
        EndIf
    EndIf
    local0\Field8 = arg6
    scaleentity(local0\Field21, arg6, arg6, arg6, $01)
    arg4 = ("GFX\Items\Inventory Icons\" + arg4)
    For local1 = Each itemtemplates
        If (local1\Field1 = arg4) Then
            If (local1\Field14 <> $00) Then
                local0\Field14 = local1\Field14
                local0\Field1 = local1\Field1
            EndIf
            If (local1\Field10 <> $00) Then
                local0\Field10 = local1\Field10
            EndIf
            Exit
        EndIf
    Next
    If (local0\Field14 = $00) Then
        local0\Field14 = X0BBB0D868(loadimage_strict(arg4), (64.0 * menuscale), (64.0 * menuscale), $01)
        local0\Field1 = arg4
    EndIf
    If (arg9 <> "") Then
        If (local0\Field10 = $00) Then
            arg9 = ("GFX\Items\Inventory Icons\" + arg9)
            local0\Field10 = X0BBB0D868(loadimage_strict(arg9), (64.0 * menuscale), (64.0 * menuscale), $01)
        EndIf
    EndIf
    If (arg5 <> "") Then
        arg5 = ("GFX\Items\HUD Textures\" + arg5)
        local0\Field2 = arg5
    EndIf
    local0\Field9 = arg2
    local0\Field19 = arg1
    local0\Field24 = arg0
    local0\Field5 = arg7
    local0\Field23 = (((((((((((((generateseednumber(arg1) + generateseednumber((Str arg2))) + generateseednumber((Str arg7))) + generateseednumber(arg3)) + generateseednumber(arg4)) + generateseednumber(arg5)) + generateseednumber((Str arg6))) + XD224F0442(arg1)) + XD224F0442((Str arg2))) + XD224F0442(arg3)) + XD224F0442(arg4)) + XD224F0442(arg5)) + XD224F0442((Str arg6))) + XD224F0442((Str arg7)))
    hideentity(local0\Field21)
    local0\Field7 = Y0846Z64F8(strippath(local0\Field16))
    local0\Field12 = ""
    Return local0
    Return Null
End Function
