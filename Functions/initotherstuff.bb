Function initotherstuff%()
    Local local0$
    Local local1#
    Local local2$
    XZ0260X8X2\Field38 = $02
    XZ0260X8X2\Field40 = $FFFFFFFF
    opt\Field2 = opt\Field5
    chs\Field5 = 2.0
    If (opt\Field30 <> 0) Then
        initcheats()
    EndIf
    autosave\Field0 = 4200.0
    If (selecteddifficulty\Field1 <> $00) Then
        opt\Field35 = $00
    EndIf
    local1 = (-400.0 * menuscale)
    XF42DX80F4 = local1
    A8F8B0DF4 = local1
    If (selectedcustommap = Null) Then
        local0 = format(getlocalstring("menu", "new.seed2"), randomseed, "%s")
    Else
        local2 = converttoutf8(selectedcustommap\Field0)
        If (len(local2) > $0F) Then
            local0 = format(getlocalstring("menu", "new.map"), (left(local2, $0E) + ".."), "%s")
        Else
            local0 = format(getlocalstring("menu", "new.map"), local2, "%s")
        EndIf
    EndIf
    seterrormsg($08, local0)
    Return $00
End Function
