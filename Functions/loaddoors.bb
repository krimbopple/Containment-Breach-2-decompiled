Function loaddoors%()
    Local local0%
    Local local1%[2]
    Local local2%
    Local local3%
    Local local4%
    Local local5%
    Local local6%
    Local local7%
    Local local8%
    d_i = (New doorinstance)
    local1[$00] = loadtexture_strict("GFX\Map\Textures\Door01_Corrosive.png", $01, $00, 1.0)
    local1[$01] = loadtexture_strict("GFX\Map\Textures\containment_doors_Corrosive.png", $01, $00, 1.0)
    For local0 = $00 To $09 Step $01
        d_i\Field10[local0] = createpivot($00)
    Next
    For local0 = $00 To $06 Step $01
        d_i\Field11[local0] = createpivot($00)
    Next
    For local0 = $00 To $03 Step $01
        d_i\Field4[local0] = createpivot($00)
    Next
    d_i\Field9[$00] = loadmesh_strict("GFX\Map\Props\Door01.b3d", $00, $01)
    d_i\Field9[$01] = loadmesh_strict("GFX\Map\Props\ElevatorDoor.b3d", $00, $01)
    d_i\Field9[$02] = loadmesh_strict("GFX\Map\Props\HeavyDoor1.b3d", $00, $01)
    d_i\Field9[$03] = loadmesh_strict("GFX\Map\Props\HeavyDoor2.b3d", $00, $01)
    d_i\Field9[$04] = loadmesh_strict("GFX\Map\Props\contdoorleft.b3d", $00, $01)
    d_i\Field9[$05] = loadmesh_strict("GFX\Map\Props\contdoorright.b3d", $00, $01)
    d_i\Field9[$06] = loadanimmesh_strict("GFX\Map\Props\officedoor.b3d", $00, $01)
    d_i\Field9[$07] = loadmesh_strict("GFX\Map\Props\DoorWooden.b3d", $00, $01)
    d_i\Field9[$08] = loadanimmesh_strict("GFX\Map\Props\FenceDoor.b3d", $00, $01)
    d_i\Field9[$09] = loadmesh_strict("GFX\Map\Props\Door02.b3d", $00, $01)
    For local0 = $00 To $09 Step $01
        GUESSEDcreateentity_8(d_i\Field9[local0])
        GUESSEDcreatesurface(d_i\Field9[local0], $01, $FFFFFFFF)
        showentity(d_i\Field9[local0])
    Next
    d_i\Field16[$00] = loadmesh_strict("GFX\Map\Props\DoorFrame.b3d", $00, $01)
    d_i\Field16[$01] = loadmesh_strict("GFX\Map\Props\ContDoorFrame.b3d", $00, $01)
    d_i\Field16[$02] = loadmesh_strict("GFX\Map\Props\officedoorframe.b3d", $00, $01)
    d_i\Field16[$03] = loadmesh_strict("GFX\Map\Props\DoorWoodenFrame.b3d", $00, $01)
    d_i\Field7 = loadmesh_strict("GFX\Map\Props\DoorColl.b3d", $00, $01)
    hideentity(d_i\Field7)
    d_i\Field5 = loadmesh_strict("GFX\Map\Props\BigDoorColl.b3d", $00, $01)
    hideentity(d_i\Field5)
    For local0 = $00 To $03 Step $01
        GUESSEDcreateentity_8(d_i\Field16[local0])
        GUESSEDcreatesurface(d_i\Field16[local0], $01, $FFFFFFFF)
        showentity(d_i\Field16[local0])
    Next
    d_i\Field2[$01] = loadtexture_strict("GFX\Map\Textures\elevator_panel_down.png", $01, $01, 1.0)
    d_i\Field2[$00] = loadtexture_strict("GFX\Map\Textures\elevator_panel_up.png", $01, $01, 1.0)
    d_i\Field2[$02] = loadtexture_strict("GFX\Map\Textures\elevator_panel_idle.png", $01, $01, 1.0)
    d_i\Field14 = loadmesh_strict("GFX\Map\Props\elevator_panel.b3d", $00, $01)
    hideentity(d_i\Field14)
    d_i\Field1[$00] = loadtexture_strict("GFX\Map\Textures\keypad.jpg", $01, $01, 1.0)
    d_i\Field1[$01] = loadtexture_strict("GFX\Map\Textures\keypad_using.png", $01, $01, 1.0)
    d_i\Field1[$02] = loadtexture_strict("GFX\Map\Textures\keypad_locked.png", $01, $01, 1.0)
    d_i\Field1[$03] = loadtexture_strict("GFX\Map\Textures\keypad_106.png", $01, $01, 1.0)
    d_i\Field8[$00] = loadanimmesh_strict("GFX\Map\Props\Button.b3d", $00, $01)
    d_i\Field8[$05] = loadmesh_strict("GFX\Map\Props\Button_base.b3d", $00, $01)
    local2 = loadmesh_strict("GFX\Map\Props\Button_button.b3d", d_i\Field8[$05], $01)
    nameentity(local2, "Button0")
    GUESSEDcreateentity_8(local2)
    d_i\Field8[$06] = loadmesh_strict("GFX\Map\Props\ButtonElevator_Base.b3d", $00, $01)
    local2 = loadmesh_strict("GFX\Map\Props\ButtonElevator_Up.b3d", d_i\Field8[$06], $01)
    nameentity(local2, "Button0")
    GUESSEDcreateentity_8(local2)
    local2 = loadmesh_strict("GFX\Map\Props\ButtonElevator_Down.b3d", d_i\Field8[$06], $01)
    nameentity(local2, "Button1")
    GUESSEDcreateentity_8(local2)
    d_i\Field8[$01] = loadmesh_strict("GFX\Map\Props\ButtonKeycard.b3d", $00, $01)
    d_i\Field8[$02] = loadmesh_strict("GFX\Map\Props\ButtonCode.b3d", $00, $01)
    d_i\Field8[$03] = loadmesh_strict("GFX\Map\Props\ButtonScanner.b3d", $00, $01)
    d_i\Field8[$04] = loadanimmesh_strict("GFX\Map\Props\ButtonElevator.b3d", $00, $01)
    For local0 = $00 To $06 Step $01
        GUESSEDcreateentity_8(d_i\Field8[local0])
        showentity(d_i\Field8[local0])
    Next
    For local0 = $00 To $09 Step $01
        copyentity(d_i\Field9[local0], d_i\Field10[local0])
        copyentity(d_i\Field9[local0], d_i\Field10[local0])
    Next
    For local0 = $00 To $03 Step $01
        copyentity(d_i\Field16[local0], d_i\Field4[local0])
        copyentity(d_i\Field16[local0], d_i\Field4[local0])
    Next
    For local0 = $00 To $03 Step $01
        copyentity(d_i\Field8[$05], d_i\Field11[$00])
        copyentity(d_i\Field8[$06], d_i\Field11[$04])
        copyentity(d_i\Field8[$01], d_i\Field11[$01])
        copyentity(d_i\Field8[$03], d_i\Field11[$03])
        copyentity(d_i\Field8[$02], d_i\Field11[$02])
    Next
    For local5 = $00 To $09 Step $01
        local3 = countchildren(d_i\Field10[local5])
        For local0 = $01 To local3 Step $01
            local6 = getchild(d_i\Field10[local5], local0)
            entitytexture(local6, local1[(local0 - $01)], $00, $00)
            GUESSEDcreateentity_8(local6)
        Next
    Next
    For local5 = $00 To $03 Step $01
        local3 = countchildren(d_i\Field4[local5])
        For local0 = $01 To local3 Step $01
            local6 = getchild(d_i\Field4[local5], local0)
            entitytexture(local6, local1[(local0 - $01)], $00, $00)
            GUESSEDcreateentity_8(local6)
        Next
    Next
    For local5 = $00 To $06 Step $01
        local3 = countchildren(d_i\Field11[local5])
        For local0 = $01 To local3 Step $01
            local6 = getchild(d_i\Field11[local5], local0)
            entitytexture(local6, d_i\Field1[(local0 - $01)], $00, $00)
            GUESSEDfreeentity_7(local6, $FFFFFFFF, $00)
            GUESSEDcreateentity_8(local6)
            local4 = countchildren(local6)
            For local7 = $01 To local4 Step $01
                local8 = getchild(local6, local7)
                entitytexture(local8, d_i\Field1[(local0 - $01)], $00, $00)
                GUESSEDfreeentity_7(local8, $FFFFFFFF, $00)
                GUESSEDcreateentity_8(local8)
            Next
        Next
    Next
    Return $00
End Function
