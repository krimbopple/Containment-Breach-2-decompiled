Function X2X0826Z80%(arg0.items)
    Local local0.TX2BF6X0FF4
    Local local1#
    Local local2#
    Local local3#
    If (X4BX024DX0() = $00) Then
        Return $00
    EndIf
    arg0\Field33 = $00
    If (arg0\Field17 <> 0) Then
        local0 = TXXF6F02DB2[arg0\Field29]
        If (entityhidden(arg0\Field9) = $00) Then
            hideentity(arg0\Field9)
        EndIf
        If (local0 <> Null) Then
            arg0\Field33 = (local0\Field53 = arg0\Field27)
            positionentity(arg0\Field9, entityx(local0\Field50, $01, 1.0), entityy(local0\Field50, $01, 1.0), entityz(local0\Field50, $01, 1.0), $01)
        EndIf
        entityfreeze(arg0\Field9, $01)
        entityalpha(arg0\Field5, 1.0)
        arg0\Field35 = 0.0
    ElseIf (((X4BX024DX0() <> $00) And (TXB2BFFFFFX() = $00)) <> 0) Then
        arg0\Field41 = max((arg0\Field41 - fps\Field3[$00]), 0.0)
        If (((0.0 >= arg0\Field41) And (0.0 >= arg0\Field26)) <> 0) Then
            local1 = (arg0\Field43 - entityx(arg0\Field9, $01, 1.0))
            local2 = (arg0\Field4 - entityy(arg0\Field9, $01, 1.0))
            local3 = (arg0\Field37 - entityz(arg0\Field9, $01, 1.0))
            If (0.3 < (((local1 * local1) + (local2 * local2)) + (local3 * local3))) Then
                positionentity(arg0\Field9, arg0\Field43, arg0\Field4, arg0\Field37, $01)
                rotateentity(arg0\Field9, 0.0, entityyaw(arg0\Field9, $00, 1.0), 0.0, $00)
                entitylinearvelocity(arg0\Field9, 0.0, 0.0, 0.0)
                entityangularvelocity(arg0\Field9, 0.0, 0.0, 0.0)
                entityfreeze(arg0\Field9, $01)
            Else
                entitylinearvelocity(arg0\Field9, (local1 * 0.1), (local2 * 0.1), (local3 * 0.1))
                entityfreeze(arg0\Field9, $00)
            EndIf
        EndIf
    EndIf
    arg0\Field26 = (arg0\Field26 - fps\Field3[$00])
    Return $00
End Function
