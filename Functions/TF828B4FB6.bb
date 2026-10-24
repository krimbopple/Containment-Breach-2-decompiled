Function TF828B4FB6%(arg0$, arg1$)
    Local local0.T20B686ZD2Z
    Local local1.T20B686ZD2Z
    Local local2%
    arg0 = lower(arg0)
    arg1 = lower(arg1)
    For local0 = Each T20B686ZD2Z
        If (((local0\Field0 = arg0) And (local0\Field1 = arg1)) <> 0) Then
            showentity(local0\Field3)
            Return local0\Field3
        EndIf
    Next
    local0 = (New T20B686ZD2Z)
    For local1 = Each T20B686ZD2Z
        If (local1\Field0 = arg0) Then
            local0\Field3 = copyentity(local1\Field3, $00)
            Exit
        EndIf
    Next
    If (local0\Field3 = $00) Then
        local0\Field3 = loadmesh_strict(arg0, $00, (instr(arg0, "addons", $01) < $01))
    EndIf
    local0\Field0 = arg0
    local0\Field1 = arg1
    entitydestructor(local0\Field3, FuncPtr(XX60XBB086))
    BZ80B2864(local0\Field3, $01)
    If (arg1 <> "") Then
        local2 = loadtexture_strict(arg1, $01, $00, 1.0)
        entitytexture(local0\Field3, local2, $00, $00)
        deletesingletextureentryfromcache(local2, $00)
        local2 = $00
        X8F80Z2886(local0\Field3, $FFFFFFFF, $00)
    EndIf
    local0\Field2 = TXZDB8BD842(local0\Field3)
    Return local0\Field3
    Return $00
End Function
