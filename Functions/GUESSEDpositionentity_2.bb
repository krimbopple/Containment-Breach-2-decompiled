Function GUESSEDpositionentity_2%(arg0.TX2BF6X0FF4, arg1%)
    Local local0.XZBB2222DZ
    Local local1.D6BZZF0B6
    Local local2#
    GUESSEDfreeentity_11(arg0, arg1)
    local0 = arg0\Field43[arg1]
    local1 = GUESSEDupdateobjects_30(local0\Field7)
    If ((((local1 = Null) Lor (local0\Field2 = "")) Lor (local0\Field2 = "PTAG_INVISIBLE")) <> 0) Then
        Return $00
    EndIf
    local0\Field6 = GUESSEDsettex_2(local1, local0\Field2, local0\Field0, local0\Field3)
    If (local0\Field6 <> $00) Then
        local2 = 1.0
        If (0.0 < arg0\Field55\Field6) Then
            local2 = arg0\Field55\Field6
        EndIf
        entityparent(local0\Field6, arg0\Field52, $01)
        scalesprite(local0\Field6, ((local0\Field5 * (128.0 / local1\Field3)) * local2), (local0\Field4 * local2))
        positionentity(local0\Field6, 0.0, local0\Field8, 0.0, $00)
    EndIf
    Return $00
End Function
