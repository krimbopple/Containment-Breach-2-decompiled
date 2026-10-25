Function initmainmenuassets%()
    Local local0%
    Local local1.XZ8B4B628
    T42DZ064FB = (New mainmenu)
    mma = (New mainmenuassets)
    mma\Field2 = scaleimageex(loadimage_strict("GFX\Menu\secure_contain_protect.png"), (menuscale * 0.5), (menuscale * 0.5), $01)
    mma\Field5 = scaleimageex(loadimage_strict("GFX\Menu\scp_173_back.png"), menuscale, menuscale, $01)
    mma\Field3 = scaleimageex(loadimage_strict("GFX\Menu\scpcb_logo.png"), (menuscale * 0.6), (menuscale * 0.6), $01)
    mma\Field1 = loadimage_strict("GFX\Menu\news.png")
    mma\Field4 = scaleimageex(loadimage_strict("GFX\Menu\media.png"), (menuscale * 0.5), (menuscale * 0.5), $01)
    mma\Field0 = scaleimageex(loadanimimage_strict("GFX\Menu\media_click.png", $40, $40, $00, $04), (menuscale * 0.8), (menuscale * 0.8), $03)
    T42DZ064FB\Field12[$00] = 1.0
    T42DZ064FB\Field12[$01] = 1.0
    T42DZ064FB\Field8 = createcamera($00)
    positionentity(T42DZ064FB\Field8, 10.0, 10.5, 10.0, $00)
    rotateentity(T42DZ064FB\Field8, 15.0, 0.0, 0.0, $00)
    T42DZ064FB\Field11 = 0.8
    GUESSEDloadentity_3("Frank Morris", "GFX\NPCs\class_d.b3d", "GFX\NPCs\class_d.png", 0.03, -1.1, $0F, PackTwoValues($D2, $EB), 0.1)
    GUESSEDloadentity_3("John Coffrey", "GFX\NPCs\class_d.b3d", "GFX\NPCs\class_d(2).png", 0.03, -1.1, $0F, PackTwoValues($D2, $EB), 0.1)
    GUESSEDloadentity_3("Vladislav", "GFX\NPCs\class_d.b3d", "GFX\NPCs\class_d(3).png", 0.03, -1.1, $0F, PackTwoValues($D2, $EB), 0.1)
    GUESSEDloadentity_3("Benjamin Walker", "GFX\NPCs\class_d.b3d", "GFX\NPCs\D_9341.png", 0.03, -1.1, $0F, PackTwoValues($D2, $EB), 0.1)
    GUESSEDloadentity_3("Walter", "GFX\NPCs\class_d.b3d", "GFX\NPCs\class_d(4).png", 0.03, -1.1, $0F, PackTwoValues($D2, $EB), 0.1)
    GUESSEDloadentity_3("Dmitriy", "GFX\NPCs\class_d.b3d", "GFX\NPCs\class_d(5).png", 0.03, -1.1, $0F, PackTwoValues($D2, $EB), 0.1)
    T42DZ064FB\Field6 = (First XZ8B4B628)
    For local1 = Each XZ8B4B628
        If (local1\Field1 = opt\Field42) Then
            T42DZ064FB\Field6 = local1
            Exit
        EndIf
    Next
    opt\Field42 = T42DZ064FB\Field6\Field1
    For local0 = $00 To $01 Step $01
        buttonsfx[local0] = loadsound_strict((("SFX\Interact\Button" + (Str local0)) + ".ogg"))
    Next
    TXFD22D0402\Field5 = $00
    GUESSEDscalescaleimageex()
    If (opt\Field20 = $00) Then
        GUESSEDresetresetinput(getlocalstring("mpmenu", "earlyaccessheader"), getlocalstring("mpmenu", "earlyaccesstext"), getlocalstring("gui", "ok"), "", $00, FuncPtr(TDDF00XF20), $01, $00)
    EndIf
    Return $00
End Function
